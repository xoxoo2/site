package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

//stream + Buffered => byte

public class java_io9 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\222.txt";
		
		try {
			
			//File f = new File(url)
			InputStream is = new FileInputStream(url);
			BufferedInputStream bis = new BufferedInputStream(is);
			System.out.println(bis.available()); 						//file용량
			
			byte[] data = new byte[bis.available()/100];				//byte 배열로 데이터를 이관
			
			//System.out.println(new String(data));				//(bis.read());
			
			//int by = bis.read(data); 								//=>int 경우 이미지, 동영상 등../
			
			bis.read(data);											//ASCII 일  경우 read만 적용
			
			
			//new Sring(byte변수, 언어셋)
			String word = new String(data, "UTF-8");
			System.out.println(word);
			
			bis.close();
			is.close();
		}
		catch(Exception e) {
			
		}finally {
			
		}

	}

}


//inputStram + StramReader + BufferedReader

class stream_reader{
	String url = "D:\\ftp\\222.txt";
	
	
	public void filedata() {
		//byte[] 사용하지 않음
		
		try {
			//readLine() => String, read() =>byte
			
			InputStream is = new FileInputStream(url);							//byte
			
			InputStreamReader isr = new InputStreamReader(is);					//String 변환
			BufferedReader br = new BufferedReader(isr);					//String 
			
			System.out.println(br.readLine());
			
			//반복문으로 출력
			
			br.close();
			isr.close();
			is.close();
			
		}catch (Exception e) {
			System.out.println("파일 경로가 올바르지 않습니다.");
			
		}finally {
			
		}
		
	}
	
}





