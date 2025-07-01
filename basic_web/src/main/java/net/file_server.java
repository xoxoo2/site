package net;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//파일 보관 서버(FTP 서버)

public class file_server {

	public static void main(String[] args) {
		new ftp_server(10000);

	}

}

class ftp_server{
	int port =0;																//오픈할 서버 포트
	Socket sk = null;															//Client가 접속 할 수 있도록 서버를 유지시키는 역할
	ServerSocket ss = null;														//해당 포트를 이용하여 서버오픈
	InputStream is = null;														//client에서 받아오는 파일
	FileOutputStream fs = null;													//server pc 저장하는 파일
	
	
	public ftp_server(int p) {
		this.port = p;
		this.data();
		}



private void data() {
	try {
		this.ss = new ServerSocket(this.port);										//해당 pc에서 포트를 오픈
		this.sk = this.ss.accept();													//클라언트 접속 대기
		System.out.println("****서버 가동중*****");
		String url = "d:\\ftp\\";													//클라이언트에서 전속된 파일 저장소
		
		
		
		//클라이언트가 전송한 파일을 읽어들여서 체크하는 코드
		this.is = this.sk.getInputStream();
		
		//파일명을 체크하는 코드 : DataInputStream (파일명 + 파일용량)
		DataInputStream ds = new DataInputStream(this.is);
		String file_name = ds.readUTF();								//readUTF : 문자로 전송된 값
		
		//System.out.println = ds.readUTF();								//(ds.readUTF());
		
		byte data[] = new byte[2097152];										//2mb 씩 파일을 체크
		
		
/*		//ASCII 형태의 파일 경우 해당 내용을 확인하여 출력할 수 있음 (Binary X)
		
		int by = this.is.read(data);
		String filename = new String(data,0,by, StandardCharsets.UTF_8);
		System.out.println(filename);
		
		//byte data[] = new byte[this.is.available()];
		
		this.is.read(data);
		System.out.println(this.is.available());									//전송파일 용량체크
		
		*/
		
		this.fs = new FileOutputStream(url+file_name);
		int filesize = 0;
		
		while((filesize = this.is.read(data)) != -1){
			
			this.fs.write(data,0,filesize);
			this.fs.flush();
		}
		
		
		//this.fs.write(data);
		
		
		System.out.println("정상적으로 업로드 완료 되었습니다. ");
		
		
		this.is.close();
		this.fs.close();
		this.sk.close();
		
	}catch (Exception e) {
		System.out.println("서버 PORT 충돌로 인하여 오류 발생!!");
	}
}
}
