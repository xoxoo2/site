package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udp_client {

	public static void main(String[] args) {
		new data_client();

	}

}

class data_client{
	String ip = "172.30.1.22";
	
	int port = 10000;											//서버 port 절대 수정 금지 (서버가 변경될 시에만 수정)
	int myport = 9999;														//자신이 사용하는 port
	
	
	DatagramSocket ds = null;											//UDP 접속하는 역할
	DatagramPacket dp = null;											//UDP 데이터 송수신 필요한 크기
	InetAddress ia = null;												//자신의 ip 정보 및 port를 확인
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public data_client(){
		try {
			//다중 접속 할 수 있도록 자신의 UDP PORT가 자동으로 생성되도록 함
			this.myport = (int)Math.ceil(Math.random()*1000) + 9000;
			
			this.ia = InetAddress.getByName(this.ip);
			this.ds = new DatagramSocket(this.myport);								//서버에 자신의 PORT
			this.udp_cn();
			
		}
		catch(Exception e) {
			System.out.println("서버 접속 오류 발생!!");
		}
		
	}
	
	private void udp_cn() {
		try {
			
			while(true) {
				System.out.println("메세지를 입력하세요 : ");
				this.isr = new InputStreamReader(System.in);						//메세지 입력파트
				this.br = new BufferedReader(this.isr);							//사용자가 입력한 값을 메모리 저장
				String msg = this.br.readLine();							//메모리에 있는 값을 변수저장
				byte by[] = msg.getBytes();									//문자를 byte로 변환
				
				//전송할 내용을 packet로 생성함
				this.dp = new DatagramPacket(by, by.length, this.ia, this.port);
				this.ds.send(this.dp); 														//전송
				System.out.println("올바르게 서버에 전달 되었습니다.");
			
			
			//서버 메세지 출력 역할
			byte server[] = new byte[1024];
			this.dp = new DatagramPacket(server, server.length );
			this.ds.receive(this.dp);
			String server_msg = new String(this.dp.getData());						//byte -> 문자로변환
			System.out.println(server_msg);
			}
			
		}catch(Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단 됩니다.");
		}
	}
	
	
	
}