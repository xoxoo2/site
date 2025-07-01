package net;

import java.io.InputStream;
import java.io.OutputStream;
//import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server : 접속하는 서버 환경	 - TCP										//rp방화벽 풀기

public class net5 {

	public static void main(String[] args) throws Exception {
		new tcp_server().server();

	}

}

class tcp_server{
	
	int port = 10000;									//서버에서 사용하는 임시 port
	Scanner sc = new Scanner(System.in);
	ServerSocket ss =null;								//서버의 포트를 오픈하는 라이브러리
	Socket sk = null;									//해당 포트로 접속을 유지시키는 라이브러리
	InputStream is = null; 								//클라이언트에서 전송된 메세지를 받는 역할(byte)
	OutputStream os = null;								//서버엣 클라이언트로 전송하는 역할(byte)
	
	
	public void server() throws Exception {
		try {
			this.ss = new ServerSocket(port);
			

		/*	//client의 접속 ip 및 가상포트를 확인
			InetSocketAddress ia = (InetSocketAddress)this.sk.getRemoteSocketAddress();
			System.out.println(ia);
			
			System.out.println(ia.getHostName());
			String notip = ia.getAddress().toString();
			System.out.println(notip);
			
			if(notip.equals("172.30.1.75")) {
				System.out.println("해당 아이디는 차단");
			}
			else{
				System.out.println("ㅎ");
			}
			*/
			
			
			while(true) {											//무한 반복문으로 네트워크를 유지시킴
				this.sk = this.ss.accept();
				System.out.println("ㅎㅇ?");
				
				this.is = this.sk.getInputStream();					//클라이언트쪽 메세지
				
				
				byte msg[] = new byte[this.is.available()/2048];			//네트워크로 파일 전송 (Binary)
				//byte msg[] = new byte[2048];							//최대 받을 수 있는 메세지량
			
				
				this.is.read(msg);									//클라이언트에서 보낸 메세지를 byte로 읽음
				String message = new String(msg);
				System.out.println("전송된 메세지 :" +message);
				
				
				//서버에서 메세지를 클아언트로 전송
				String cms = this.sc.nextLine();
				this.os = this.sk.getOutputStream();						//byte로 전송
				byte call[] = cms.getBytes();						//뭄ㄴ자를  byte로 변환
				
				this.os.write(call);								//String 변환된 byte를 네트워크로 전송
				this.os.flush();
				this.os.close();
				this.is.close();
				

			}
			
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("동일한 포트가 충돌발생하여 서버를 가동하지 못합니다.");
			
		}finally {
			
		}
	}
}