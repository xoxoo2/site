package net;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

//https, http:80
//외부 서버에 있는 이미지를 다운받는 통신 (http로 이미지를 다운로드)

public class net3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			System.out.println("웹에서 가져올 이미지 주소를 입력하세요 :");
			String url = sc.nextLine();									//사용자가 입력한 도메인 주소
			
			URI u = new URI(url);									//URL = File : http 경로를 가져오는 역할
			
			
			//URLConnection : 해당 서버로 접근
			URI Connection con = u.openConnection();						//해당 서버로 접근
			int imgsize = con.getContentLength();
			String imgtype =con.getContentType();
			long date = con.getDate();
			
			
			
			
			
			InputStream is = u.openStream();									//net전용 stream			
			BufferedInputStream bs = new BufferedInputStream(is);
			byte b[] = new byte[bs.available() / 1024];
			
			//다운로드 받을 경로 및 파일명
			String copyurl = "d:\\ftp\\";
			OutputStream os = new FileOutputStream(copyurl + "copy.jpg");
			
			//Binary는 int, ASCII는 String
			
			bs.read(b);
			os.write(b);
			os.flush();
			
			int w=0;
			while((w=bs.read(b))!= -1) {
				os.write(b,0,w);								//0~파일크기 만큼 지속적으로 쓰기
				os.flush();
			}
			
			os.close();
			bs.close();
			is.close();
			System.out.println("복사 완료!!");
			
			
		}catch(Exception e) {
			
		}finally {
			
		}

	}

}
