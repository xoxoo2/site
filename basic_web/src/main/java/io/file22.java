package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//ASCII (Stream + Reader,Writer)
//StreamWriter, StreamReader

public class file22 {

	public static void main(String[] args) {
		
		String i = new File(isr);
		
		try {
			System.out.println("입력값은 :");
			
			//InputStreamReader  : stream + Reeeeea;                                                                                                                                                           
			
			
			
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine()); 							//메모리에 저장된 값을 읽어들임
			br.close();
			isr.close();
			
			
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   		객체 한개로 Stream, Writer를 혼합하여 사용하는 코드
			
			String msg = "주문하신 물품이 배송중에 있습니다.";
			bw.write(msg);
			
			bw.close();
			osw.close();
			
		}catch(Exception e) {
			System.out.println("코드 에러!!");
		}

	}

}
