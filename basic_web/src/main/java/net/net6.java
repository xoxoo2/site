package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Client: 해당 서버로 접속하는 클라이언트 프로그램

public class net6 {

	public static void main(String[] args) {
		new tcp_client().client();
		

	}

}

class tcp_client{
	
	Scanner sc = new Scanner(System.in);
	Socket sk = null;
	int port = 10000;
	String ip = "172.30.1.75";									//외부 서버 IP						
	InputStream is = null;											//서버에서 전송된 메세지
	OutputStream os = null;											//서버로 전송할 메세지
	
	
	public void client() {
		try {
			System.out.println("서버에 접속 준비중입니다...");
			
			
			int count = 0;									//최초 접속 카운팅

			while(true) {									//서버에 접속 후 해당 포트를 지속적으로 유지시킴
				
				this.sk = new Socket(this.ip,this.port);
				
				if(count==0) {												//this.sk 가 정상적으로 발동하여 최초 실행
					System.out.println("서버에 연결 되었습니다.");
				}
				else {		
					
					//최초 실행 메세지를 전송 , 서버로 메세지를 전송 하는 코드
					System.out.println("전송할 메세지를 입력하세요 :");
					String usermsg = this.sc.nextLine();
					
					this.os = this.sk.getOutputStream();						//byte로 전송
					byte[] msg = usermsg.getBytes();
					this.os.write(msg);
					
					
																	//서버에서 전송할 메세지를 받는 역할
					this.is = this.sk.getInputStream();				//byte로 메세지 내용을 받음
					byte[] call = new byte[2048];				//2048byte 단위로 메세지를 나눠서 받음
					this.is.read(call);								//전송된  byte 전체를 읽어 들임
					String result = new String(call);					//byte의 내용을 문자로 임시변환
					
					System.out.println("서버에서 받은 메세지 :" +result);			//해당 내용을 출력
					
					this.os.flush();					
					this.os.close();
					this.is.close();
				}
				count++;
				
				
	/*			this.sk = new Socket(this.ip,this.port);
				System.out.println(this.sk);
				
			 	if(this.sk == null) {
					System.out.println("서버 접속이 되지 않습니다.");
					*/
				}
				//System.out.println(this.sk);
								
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("상대방 서버가 접속이 차단 되었습니다.");			
		}
		finally {
			
		}
		
	}
}