package net;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class exam_server {
    public static void main(String[] args) {
        new data1_server();
    }
}

class data1_server {
    int port = 10000;
    DatagramSocket ds;
    List<ClientInfo> clients = new ArrayList<>();

    public data1_server() {
        try {
            ds = new DatagramSocket(port);
            System.out.println("UDP 서버가 시작되었습니다. 포트: " + port);

            // 메시지 수신 스레드 실행
            new Thread(this::receiveMessages).start();

            // 사용자 입력 처리 (서버 -> 모든 클라이언트)
            new Thread(this::sendMessages).start();
        } catch (Exception e) {
            System.out.println("UDP 포트 충돌로 인하여 서버가 작동되지 않습니다.");
        }
    }

    // 클라이언트 메시지 수신
    private void receiveMessages() {
        try {
            while (true) {
                byte[] buffer = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
                ds.receive(dp);

                String msg = new String(dp.getData(), 0, dp.getLength());
                InetAddress clientAddress = dp.getAddress();
                int clientPort = dp.getPort();

                // 새로운 클라이언트 추가
                addClient(clientAddress, clientPort);

                System.out.println("[클라이언트] " + "->" + msg);

                // 모든 클라이언트에게 메시지 전송 (브로드캐스트)
                sendToAll(msg);
            }
        } catch (Exception e) {
            System.out.println("UDP 서버 오류 발생: " + e.getMessage());
        }
    }

    // 서버에서 모든 클라이언트에게 메시지 전송
    private void sendMessages() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("서버 메시지 입력: ");
                String serverMessage = br.readLine();
                sendToAll("[서버]: " + serverMessage);
            }
        } catch (Exception e) {
            System.out.println("서버 메시지 전송 오류: " + e.getMessage());
        }
    }

    // 새로운 클라이언트를 리스트에 추가
    private void addClient(InetAddress address, int port) {
        for (ClientInfo client : clients) {
            if (client.address.equals(address) && client.port == port) return;
        }
        clients.add(new ClientInfo(address, port));
        System.out.println("새로운 클라이언트 추가: " + address + ":" + port);
    }

    // 모든 클라이언트에게 메시지 전송
    private void sendToAll(String msg) {
        try {
            byte[] data = msg.getBytes();
            for (ClientInfo client : clients) {
                DatagramPacket packet = new DatagramPacket(data, data.length, client.address, client.port);
                ds.send(packet);
            }
        } catch (Exception e) {
            System.out.println("메시지 전송 오류: " + e.getMessage());
        }
    }
}

// 클라이언트 정보 저장 클래스
class ClientInfo {
    InetAddress address;
    int port;

    public ClientInfo(InetAddress address, int port) {
        this.address = address;
        this.port = port;
    }
}

