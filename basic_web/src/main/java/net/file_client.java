package net;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class file_client {

	public static void main(String[] args) {
		new ftp_client("172.30.1.85",10000);
		

	}

}


class ftp_client{
	
	String ip = null;																//서버 id정보
	int port = 0;																//서버 port 정보
	Socket sk = null;																//서버 연결
	InputStream is = null;																//자신의 pc에 잇는 파일을 읽어
	OutputStream os = null;																//서버로 전송하는 역할
	Scanner sc = null;																//자신의 pc 파일 경로
	
	
	public ftp_client(String serverip, int p) {
		this.ip = serverip;															//필드에 ip 이관
		this.port = p;															//필드에 port 이관
		this.sc = new Scanner(System.in);
		this.files();															//은닉화 파일 전송을 하는 메소드를 호
	}
	
	//JAVA OOP,예외처ㅣ => IO => Net
	
	private void files() {
		try {
			
			this.sk = new  Socket(this.ip,this.port);
			System.out.println("업로드할 이미지 경로를 입력하세요 :");
			String url = this.sc.nextLine();								//사용자가 지정하는 경로 및 파일명
			
			File f = new File(url);											//파일명을 로드하기 위해 (사용자 경로+파일명)						
			
			
			//자신의 pc에 있는 파일을 읽어들임
			this.is  = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(this.is);
			byte img[] = new byte[bs.available()];
			bs.read(img);
			
			//파일명을 포함하여 서버로 전송
			this.os = this.sk.getOutputStream();
			
			
			//DataOutputStream : byte로 전송도 가능함, 단, 추가 write에 다양한 기능 탑재
			//파일명, 데이터 타입, 데이터 속성, 데이터 용량,
			
			DataOutputStream ds = new DataOutputStream(this.os);
			ds.writeUTF(f.getName());					//파일명				//File f = new File(url);
			ds.write(img);								//파일 전체 용량
			ds.flush();
			ds.close();
			
	/*		this.os = this.sk.getOutputStream();
			this.os.write(img);
			this.os.flush();
			this.os.close();		*/
			
			bs.close();
			this.is.close();
			this.sc.close();
			
			System.out.println("파일 전송이 완료 되었습니다.");
			
		}
		
		catch(SocketException se) {												//네트워크 접속에 대한 예외처리
			System.out.println("서버에 접속하지 못하였습니다.");
		}
		catch(IOException ie) {												//io 및 네트워크 전체를 다루는 예외처리
			System.out.println("파일 경로 및 파일명이 잘못 되었습니다.");
		}
	
		
		
/*		Reader r = new FileReader("");			
		}catch(IOException io) {
			System.out.println("해당 경로가 잘못 되었습니다.");		*/
			
		
		catch(Exception e) {														//최고 부모 역할을 하는 예외처리
			System.out.println("코드문제로 인하여 버그가 발생 하였습니다.");
		}
	}
}




