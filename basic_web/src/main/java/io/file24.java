package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//CSV 데이터 저장

//http://mekeyace.dothome.co.kr/member.zip

public class file24 {

	public static void main(String[] args) {
		
		//new file_csv().csv_save();
		new file_csv().csv_load();

	}

}

class file_csv{
	String url = "D:\\site\\basic_web\\src\\main\\java\\io\\member.csv";
	File f = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	FileReader fr = null;
	BufferedReader br = null;
	
	//해당 CSV 파일에 있는 데이터를 출력
	
	public void csv_load() {
		this.f = new File(url);
		
		try {
			//this.fr = new FileReader(this.f);
			
			this.fr = new FileReader(this.f,Charset.forName("euc-kr"));
			this.br = new BufferedReader(this.fr);
			
			String csv_data = "";
			while((csv_data = this.br.readLine()) !=null) {
				System.out.println(csv_data);
			}
			this.br.close();
			this.fr.close();
			
		}catch(Exception e) {
			System.out.println("");
		}
	}
	

	
	
	//해당 데이터 배열을 CSV에 저장 메소드
	
	public void csv_save() {
		
		try {
			
			
			//String data = "홍길동, 강감찬,유관순";
			//CSV 파일 형태 (,) 기준으로 구분
			//Charset.forName("euc-kr") : 한글전용 언어셋
			
			
			this.f = new File(url);									//해당 경로를 load 하는 객체
			this.fw = new FileWriter(this.f,Charset.forName("euc-kr"));
			
			
			
			//해당 파일에 데이터를 저장
			this.bw = new BufferedWriter(this.fw);					//메모리를 활용하여 파이렝 저장시키는 방식
			
			List<String> mb = new ArrayList<String>();
			
			mb.add("유재석,ISFP");					   		//,기준으로 열 구분하게 됨(csv) /공백 금지
			mb.add("강호동,ENFP");
			mb.add("조정석,INTP");
			mb.add("차은우,ENTP");
			
			for(String m:mb) {
				this.bw.write(m+"\n");
				this.bw.flush();									//write 사용시 flush 메모리 초기화
			}
			this.bw.close();
			this.fw.close();
			
		}catch(Exception e) {
			System.out.println("해당 경로에 csv 파일이 존재하지 않습니다.");
		}
		
	}
	
}
