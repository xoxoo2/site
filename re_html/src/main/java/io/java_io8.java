package io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.omg.CORBA.portable.OutputStream;

//Stream (OutputStream - 파일저장 및 복사)

public class java_io8 {

	public static void main(String[] args) {
		String ur = "D:\\ftp\\222.txt";					//해당 파일에 저장
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("입려가실 단어를 적어주세요 :");
			String msg = sc.nextLine();								//사용자가 입력한 값 (string)
			OutputStream os = new FileOutputStream(url);				//byte
			
			//getbytes : string ->byte로 ㅈ벼놘하는 역할
			
			os.write(msg.getBytes());								//byte로 저장
			os.close();
			
		}catch(Exception e) {
			
		}finally {
			
		}

	}

}
