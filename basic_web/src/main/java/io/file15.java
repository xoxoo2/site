package io;

import java.io.FileOutputStream;

//stream output stream

public class file15 {

	public static void main(String[] args) {
		String url = "";
		String word = "[개인보호 정책 약관]";
		
		try {
			
			//fileOutStream : 파일에 사용자가 입력한 내용을 저장하는 기술
			//true (기존 데이터 보존을 ㅎ가고  쓰기   
			
			FileOutputStream fs = new FileOutputStream(url);
			byte [] data = word.getBytes();
			fs.write(data);
			
			fs.close();
			
		}catch(Exception e) {
			System.out.println("해당 경로의 파일을 확인하지 못하였습니다.");
		}
	}

}
