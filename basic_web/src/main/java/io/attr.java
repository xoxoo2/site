package io;

import java.io.File;
import java.io.FileInputStream;

//속성 이름을 별도로 구성하는 코드 방식

public class attr {

	public static void main(String[] args) {
		
		String url ="D:\\site\\basic_web\\src\\main\\java\\io\\img.jpg";
		
		File f = new File(url);
		System.out.println(f.getName());
		String filename = f.getName();							//IndexOf : 해당 단어를 기준을 맨 앞에서부터 단어를 검토함 (노드번호)
		int n = filename.lastIndexOf(".");							//lastIndexOf : 해당 단어를 기준으로 맨 마지막에 해당되는 단어 노드 번호 
		
		System.out.println(n);
		
		String modify = filename.substring(n);					//substring (단어를 자르는 메소드
		System.out.println(modify);
		
		
		String word2 = "홍길동 환영합니다.";
		String sub = word2.substring(0,5);								//시작값,갯수
		System.out.println(sub);
		
		
		
	}

}









