package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import method.string_etc;

//buffer	활용하는 방식

public class file6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			String url = "D:\\site\\basic_web\\src\\main\\java\\io\\gugu.txt";
			
			FileReader fr = new FileReader(url);
			
			/*
			//buffered : 메모리를 활용하여 데이터를 출력 또는 입력을 하는 것을 말합니다 (temp)
			//readLine(): 해당 데이터 라이을 전체 읽어드림 출력하는 역할
			
			buffered 유의사항 : 조건문 또는 반복문에 적용시 해당 데이터가 유설 될 수 있음
							많은 양의 데이터를 처리할 때 유리한 상황입니다.
			
			*/
			
			BufferedReader br = new BufferedReader(fr);			
			
			String msg = null;
			
			
		/*	
			while((msg = br.readLine()) !=null) {
				System.out.println(msg);
														*/
			
			while(true) {
				msg=br.readLine();
				if(msg != null) {
					System.out.println(msg);
				}
				else {
					break;
				}			
			}
			
			
			
			System.out.println(br.readLine());					
			System.out.println(br.readLine());
		
			br.close();
			fr.close();
			
		}catch(FileNotFoundException fe ) {					//경로 전용 예외처리 파트
			System.out.println("파일 경로 문제 발생!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}


/*

해당 코드는 변수에 값을 이관 및 조건문에 사용하였으므로 데이터 누수가 발생함


*/