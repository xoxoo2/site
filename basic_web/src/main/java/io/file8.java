package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

//byte  자료형 + nio 활용하기

public class file8 {

	public static void main(String[] args) throws Exception {
		
		String word = "abcd";												
																	//byte의 기본 배열코드 형태는 ascii 형태 입니다
		byte data[] = word.getBytes();								//byte는 숫자, 원시배열을 무조건 사용
		
		System.out.println(Arrays.toString(data));
		
		String unbox = new String(data);
		System.out.println(unbox);
		
		String url = "D:\\site\\basic_web\\src\\main\\java\\io\\gugu.txt";
		byte alldata[] = Files.readAllBytes(Paths.get(url));					//readAllBytes : byte 자료형, readAllLines : String 자료형
		System.out.println(Arrays.toString(alldata));
		String unbox2 = new String(alldata);
		System.out.println(unbox2);
		
	/*	String data2[]= {"101","102","106","110"};
		String unbox2 = new String(data2);		
		
		byte : ASCII , Binary 
				*/

}
}

