package io;

import java.io.File;
import java.io.FileOutputStream;

/*

stream 응용문제

구구단 9단을 dan.txt로 저장되도록 합니다.

9*1=9
9*3=27
..
9*9=81

*/


public class file16 {

	public static void main(String[] args) {
		
		string url = "D:\\site\\basic_web\\src\\main\\java\\io\\dan.txt";
		
		try {
			File f = new File(url);
			f.createNewFile();											//신규 파일 생성
			
			FileOutputStream os = new FileOutputStream(f);
			
			int w =1;
			while(w <= 9) {
				int sum = 9*w;
				String print = "9*" + w + "=" + sum + "n";
				byte[] by = print.getBytes();				//getBytes() 문자를 byte 배열롭 변환				
				os.write(by);
				os.flush();
				
				w++;
			}
			os.close();
			
		}catch(Exception e) {
			System.out.println("해당 결로 오류 발생!!");
		}

	}

}

