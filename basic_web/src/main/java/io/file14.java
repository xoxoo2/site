package io;

import java.io.FileInputStream;
import java.util.Arrays;

//Stream 사용법 (binary)

/*
 
 inputStream (입력), OutputStream(출력) - ASCII, Binary
 inputStream => FileInputStream , AudioInputStream, ObjectIputStream
 OutputSteram => FileOutputStream
 
 FIleReader , FileWriter - ASCII
 
  */

public class file14 {

	public static void main(String[] args) {
		
		try {
			String url = "D:\\site\\basic_web\\src\\main\\java\\io\\agree.txt";
			
			File f = new File(url);
			
			//stream => byte
			
			FileInputStream fs = new FileInputStream(f);
			System.out.println(fs.available());
			byte data[] = new byte[10]; 						//[fs.available()];	 //전체 용량을 배열화
			
			fs.read(data);												//byte 전체를 읽어들이는 메소드
			String dataread = new String(data);							//byte = string  으로 변혼
			//System.out.println(Arrays.toString(data));
			System.out.println(dataread);								//최종 문자로 출력
			
			
		}
		catch(Exception e) {
			System.out.println("경로 오류가 발생 하였습니다");
		}

	}

}


