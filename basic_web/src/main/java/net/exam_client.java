package net;

import java.io.*;
import java.net.*;
import java.util.Scanner;

// UDP - client
public class exam_client {
    public static void main(String[] args) {
        new exclient1_port();
    }
}

class exclient1_port {
    String ip = "172.30.1.28";  // 서버 IP
    int port = 10000;  // 서버 포트
    int mport;  // 클라이언트 포트 (랜덤 생성)
    DatagramSocket ds;
    InetAddress ia;

    public exclient1_port() {
        try {
            // 다중 접속 가능하도록 랜덤 포트 할당
            this.mport = (int) Math.ceil(Math.random() * 1000) + 9000;
            this.ia = InetAddress.getByName(this.ip);
            this.ds = new DatagramSocket(this.mport);  // 클라이언트 포트 바인딩

            System.out.println("UDP 클라이언트 시작. 포트: " + this.mport);

            // 닉네임 입력받기
            Scanner sc = new Scanner(System.in);
            System.out.print("채팅에서 사용할 닉네임을 입력하세요: ");
            String mid = sc.nextLine();

            // 채팅 송신용 쓰레드 실행
            Thread sendThread = new exchat1_clients(this.ds, this.ia, this.port, mid);
            sendThread.start();

            // 채팅 수신용 쓰레드 실행
            Thread receiveThread = new exchat_receive(this.ds);
            receiveThread.start();

        } catch (Exception e) {
            System.out.println("서버 접속 오류 발생: " + e.getMessage());
        }
    }
}

// 송신용 Thread (UDP는 PrintStream 사용 불가 → DatagramPacket 사용)
class exchat1_clients extends Thread {
    DatagramSocket sk;
    InetAddress ia;
    int port;
    String mid;
    Scanner sc;

    public exchat1_clients(DatagramSocket s, InetAddress ia, int p, String id) {
        this.sk = s;
        this.ia = ia;
        this.port = p;
        this.mid = id;
        this.sc = new Scanner(System.in);
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.print("메시지 입력: ");
                String msg = sc.nextLine();
                if (msg.equalsIgnoreCase("exit")) {
                    System.out.println("채팅 종료");
                    sk.close();
                    break;
                }
                String sendMsg = "아이디: [" + mid + "]  " + msg;
                byte[] data = sendMsg.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, ia, port);
                sk.send(dp);
            }
        } catch (Exception e) {
            System.out.println("UDP 메시지 전송 오류: " + e.getMessage());
        }
    }
}

// 수신용 Thread
class exchat_receive extends Thread {
    DatagramSocket sk;

    public exchat_receive(DatagramSocket s) {
        this.sk = s;
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] by = new byte[1024];
                DatagramPacket dp = new DatagramPacket(by, by.length);
                sk.receive(dp);
                String msg = new String(dp.getData(), 0, dp.getLength());
                System.out.println("\n[서버] " + msg);
            }
        } catch (Exception e) {
            System.out.println("UDP 메시지 수신 오류: " + e.getMessage());
        }
    }
}

