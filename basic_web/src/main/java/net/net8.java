package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class net8 {

	public static void main(String[] args) {
		
		new net8().open();

	}
	
	public void open() {
		String ip ="172.30.1.85";
		int port = 9999;
		
		try {
			Socket sk = new Socket(ip,port);
			System.out.println("[채팅서버 접속 완료!!]");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("생성할 아이디를 입력하세요");
			
			String mid = sc.nextLine();									//생성돤 아이디르 이요앟여 채팅
			
			//서버에 메세지를 받는 역할
			Thread th = new net8_client(sk, mid);
			th.start();
			
			//접속 입장시 서버에서 오는 메세지를 받는 역할
			InputStream is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			while(br != null) {
				
				//서버에서 받은 내용을 변수로 이관
				String chat_msg = br.readLine();
				
				//퇴장
				if(chat_msg.equals(mid + "님 퇴장하였습니다.")) {
					System.out.println("채팅이 종료 되었습니다");
					System.exit(0);
				}
				
				System.out.println("전송 :"+ chat_msg);
				
			}
			br.close();
			isr.close();
			is.close();
			sc.close();
			sk.close();
			
			
		}catch(Exception e) {
			System.out.println("서버에 접속이 원활하지 않습니다.");
		}finally {
			
		}
	}

}



//thread를 이용하여 메세지를 전송
class net8_client extends Thread{
	Socket sk=null;
	String mid = null;
	Scanner sc = null;
	
	OutputStream os = null;
	PrintWriter pw = null;												//String
	PrintStream ps =null;												//String -> byte
	
	//즉 시 실행 메소드에 서버정보 및 사용자 아이디를 셋팅
	public net8_client(Socket s, String mid) {
		this.sk = s;													//접속 서버 정보
		this.mid = mid;												//사용자 앙디
		this.sc = new Scanner(System.in);							//입력창 활성화
	}
	@Override
	public void run() {												//thread로 메세지를 전송
		
		try {
			

/*			
			//최초접속시 접속아이디를전송 (첫번째 메세지)
			this.os = this.sk.getOutputStream();
			this.pw = new PrintWriter(this.os);
			this.pw.print(this.mid);
			this.pw.flush();
			
			//사용자가 입력하는 메세지를 서버로 전송
			while(true) {
				System.out.println("채팅 메세지를 입력하세요 :");
				String msg = this.sc.nextLine();
				this.pw.println(msg);
				this.pw.flush();					*/
			
			//최초접속시 접속아이디를전송 (첫번째 메세지)
			this.os = this.sk.getOutputStream();
			this.ps = new PrintStream(this.os);
			this.ps.println(this.mid);
			this.ps.flush();
			
			//사용자가 입력하는 메세지를 서버로 전송
			while(true) {
				System.out.println("채팅 메세지를 입력하세요 :");
				String msg = this.sc.nextLine();
				this.ps.println(msg);
				this.ps.flush();
				
			}
			
		}catch(Exception e) {
			System.out.println("Server 접속 묹로 채팅이 중지 됩니다.");
		}

		
	}
}