package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class server2 {

    public static void main(String[] args) {
        new DataServer();  
    }
}

class DataServer {
    int port = 10000;
    DatagramSocket ds = null;  // 
    DatagramPacket dp = null;
    InetAddress ia = null;

    InputStreamReader isr = null;
    BufferedReader br = null;

    public DataServer() {
        try {
            this.ds = new DatagramSocket(this.port);  // UDP 소켓 생성
            this.udp();
       
        } catch (Exception e) {
            System.out.println("UDP 포트 충돌로 인하여 서버가 작동되지 않습니다.");
            
        }
    }

    private void udp() {
        try {
            while (true) {
                byte serverByte[] = new byte[1024];

                
                this.dp = new DatagramPacket(serverByte, serverByte.length);
                System.out.println("상담 시작!!");

                
                this.ds.receive(this.dp);

                String msg = new String(this.dp.getData(), 0, this.dp.getLength());  
                System.out.println("클라이언트로부터 받은 메시지: " + msg);

                
                System.out.println("메시지를 입력하세요: ");
                this.ia = this.dp.getAddress();  
                int clientPort = this.dp.getPort();  

                this.isr = new InputStreamReader(System.in);
                this.br = new BufferedReader(this.isr);
                String responseMessage = this.br.readLine();  // 응답 메시지 입력

                byte[] clientMsg = responseMessage.getBytes();

                
                this.dp = new DatagramPacket(clientMsg, clientMsg.length, this.ia, clientPort);
                this.ds.send(this.dp);  

                // 새 스레드로 클라이언트 메시지 처리
                DatagramPacket receivePacket = new DatagramPacket(clientMsg, clientMsg.length);
                new Thread(new ClientHandler(receivePacket)).start();  // 메시지를 처리할 스레드 생성
            }
        } catch (Exception e) {
            System.out.println("UDP 서버 오류 발생!!");
            e.printStackTrace();
        }
    }

    // 클라이언트의 메시지를 처리할 스레드
    class ClientHandler implements Runnable {
        private DatagramPacket packet;

        public ClientHandler(DatagramPacket packet) {
            this.packet = packet;
        }

        @Override
        public void run() {
            try {
                InetAddress clientAddress = packet.getAddress();  // 클라이언트 IP
                int clientPort = packet.getPort();  // 클라이언트 포트
                String receivedMessage = new String(packet.getData(), 0, packet.getLength()).trim();  // 받은 메시지
                System.out.println("클라이언트로부터 받은 메시지: " + receivedMessage);

                // 서버 응답 메시지 입력
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("클라이언트에게 보낼 메시지 입력: ");
                String responseMessage = reader.readLine();  // 서버 응답 메시지

                // 응답 메시지 전송
                byte[] responseBytes = responseMessage.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, clientAddress, clientPort);
                ds.send(responsePacket);  // 응답을 클라이언트에게 전송
                System.out.println("클라이언트에게 응답 보냈음: " + responseMessage);
            } catch (Exception e) {
                System.out.println("클라이언트 메시지 처리 중 오류 발생.");
                e.printStackTrace();
            }
        }
    }
}