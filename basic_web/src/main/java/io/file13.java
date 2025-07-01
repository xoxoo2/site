package io;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//ASCII 주의사항

public class file13 {

	public static void main(String[] args) {
		
		try {
			String url = "D:\\site\\basic_web\\src\\main\\java\\io\\text.txt";
			File fe = new File(url);
			fe.createNewFile();
			
			FileWriter fw = new FileWriter(url);
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 :");
			
		/*	int user = sc.nextInt();
			String user = sc.next();
			double user = sc.nextDouble();
			FileWriter 사용시 : int , Integer , double , float 해당 숫자형의 데이터는 저장시 글자가 깨짐 또는 저장되지 않습니다.
			*/
			
			fw.write(String.valueOf(user));
			
			sc.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println("파일 경로 오류!!");
		}

	}

}
