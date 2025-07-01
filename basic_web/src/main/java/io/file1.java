package io;

import java.io.FileReader;

/*

		io : input(입력), output(출력) => try-catch
		
		input : 키보드, 마우스, HDD, SSD, File, scanner
		output: 모니터, 프린터, QR , barcode

*/

public class file1 {

	public static void main(String[] args) {
		
		
		try {
			
			/*
			
			fileReader : 문자 데이터를 (ASCII) 읽는 라이브러리
			fileWriter : 문자 데이터를 (ASCII) 저장하는 라이브러리 
			
			ascii : memo every cods are ascii
			 binary : image archive
			
			무한루프 : 파일 저체를 읽어 들여야함
			
			*/
			
			
			
			FileReader fr = new FileReader("D:\\site\\basic_web\\src\\main\\java\\io\\agree.txt");
			
			System.out.println(fr.getEncoding());						//파일의 언어셋
			System.out.println(fr.read());								//데이터(파일) 크기 : 문자단위당 ascii 번호
			
			
			while(true) {
				int size = fr.read();
				System.out.println(size);
				
				System.out.println((char)size);
				if(size == -1) {							//해당 파일에 더 이상 읽을 내용이 없을 경우
					break;
				}
			}
			
			fr.close();												//읽은 파일 내용을 종료하는 메소드
			
		}catch(Exception e) {
			System.out.println("해당 파일을 찾을 수 없습니다. ");
		}

	}

}
