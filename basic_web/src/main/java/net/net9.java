package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//멀티 포트로 서버를 오픈하기

public class net9 {

	public static void main(String[] args) {
		new server_open();

	}

}

class server_open{										//해당 port를 이용하여 하나의 서버에서 여러개의 채널을 분리 
	public server_open() {
		int port[]= {9001,9002,9003};												//포트 오픈하는 원시배열
		int w =0;
		
		while(w<port.length) {										//반복문으로  thread 클래스를 이용하여 실행
			
			/*배열순서에 맞게 thread 활성화
			  server_port sp = new server_port(port[w])
			
			*
			*/
			
			
			server_port sp = new server_port(port[w]);
			//sp.start();
			
			Thread th = new server_port(w);
			th.start();															//thread 가동
			
			w++;	
		}
			
		}
}

//각각의 포트별로 서버를 오픈!!	(각 포트별  THread -> 각 포트별 채널을 나누는 작업)
class server_port extends Thread{
	
	int port =0;
	ServerSocket sk = null;
	Scanner sc = null;
	public server_port(int p) {
		this.port =p;
	}
	
	
	@Override
	public void run() {											//thread로 각각의 port를 작동시키는 메소드
		try {
			this.sk = new ServerSocket(this.port);										//해당 포트 오픈
			
			while(true) {
															
				System.out.println(this.port +"서버 오픈됨!!");
				
				while(true) {
					
					Socket s = this.sk.accept();
					room rm = new room(s);
				}
			}
			
		}catch(Exception e) {
			System.out.println("중복된 PORT가 존재하므로 서버를 종료 합니다.");
		}
	}
	
	//String ip = "172.30.1.86";		//22
	
}


//송신, 수신 역할 클래스	(Thread -> 
class room extends Thread{
	
	public room(Socket s) {
		
		try {
			this.s =s;
			
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			System.out.println(pw.toString());
			
	/*		InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
			*/
			
		}catch(Exception e){
			
			System.out.println(e);
			System.out.println("채팅 서버 클라이언트 통신 오류!!");
		}
	}
}

