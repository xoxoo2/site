package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udp_server {

	public static void main(String[] args) {
		new data_server();

	}

}

class data_server{
	int port = 10000;
	DatagramSocket ds= null;															//UDP PORT를 오픈하는 역할
	DatagramPacket dp= null;															//UDP 내부 데이터 통신 사이즈
	InetAddress ia = null;															
	
	InputStreamReader isr = null;															
	BufferedReader br = null;															
	
	public data_server() {
		try {
			this.ds = new DatagramSocket(this.port);
			this.udp();
			
		}catch(Exception e) {
			System.out.println("UDP 포트 충돌로 인하여 서버가 작동 되지 않습니다.");
		}
	}
	
	//Packet : 네트워크를 통해서 데이터를 전송할 떄 사용하는 단위
	//DatagramPacket(byte 배열, 배열전체크기)
	//DatagramPacket(byte 배열, 배열전체크기, client IP ,Client port)
	//receive(받는내용), send(보내는 내용)
	
	private void udp() {
		try {
			
			while(true) {		//UDP 통신을 지속적으로 서버를 오픈
				byte server_byte[] = new byte[1024];
				
				//UDP 패킷 크기 만큼 지속적으로 통신 대기 상태로 오픈됨
				
				this.dp = new DatagramPacket(server_byte, server_byte.length);
				System.out.println("상담시작!!");
				
				this.ds.receive(this.dp); 								//클라이언트에서 전송한 메세지를 받는
				
				String msg = new String(this.dp.getData());
				
				System.out.println("메세지를 입력하세요 :");				
				System.out.println(msg);
				
				//client 전송 메세지
				
				this.ia = this.dp.getAddress();
				//System.out.println(this.dp.getAddress());
				
				int client_port = this.dp.getPort();
				
				//System.out.println(this.dp.getPort());
				this.isr = new InputStreamReader(System.in);						//작성돤 내용을 입력받는 객체
				this.br = new BufferedReader(this.isr);						//입력된 내용을 메모리에 등록
				
				//String msg2 = this.br.readLine();
				byte client_msg[] = this.br.readLine().getBytes();
				
				
				this.dp = new DatagramPacket(client_msg,client_msg.length,this.ia, client_port);
				this.ds.send(this.dp); 										//만들어진 패킷을 send로 전송
			
			}
			
		}catch(Exception e) {
			System.out.println("UDP 서버 오류발생!!");
		}
	}
	
}