package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//CSV 데이터 응용편
/*  	http://mekeyace.dothome.co.kr/user.csv

해당 데이터를 운영팀에서 전달받은 상황입니다. 해당 csv 데이터값을 사용하여
다음과 같은 결과가 되도록 코드를 작성합니다.

사용자 정보 중 통신사 입니다. SKT,KT,LGT,알뜰폰 구분이 되어있는 상황입니다.
각각의 통신사별로 csv 를 저장하시오.

skt.csv
kt.csv
lgt.csv
알뜰폰.csv

*/


public class file25 {

	public static void main(String[] args) {
			
		
		/*	while((csv_data = this.br.readLine())!=null;) {
			
			//System.out.println(csv_data);
			//split은 해당 문자 기준으로 원시배열로 생성하는 메소드
			
			String user[] = csv_data.split(",");
			if(user[1].equals("INTP")) {
				
			}*/
			
		}

	}


class csv_members{
	//DTO 클래스를 필드에 로드하여 setter,getter 활용함
	//public io_DTO dto;
	//io_DTO dto = new io_DTO();
	
	io_DTO dto = null;								//DTO 클래스를 필드에 로드하여 setter,getter 활용함
	
	
	String url = "D:\\site\\basic_web\\src\\main\\java\\io\\user.csv";			//원본 데이터 파일
	
	String copys = "D:\\site\\basic_web\\src\\main\\java\\io\\";
	
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	
	OutputStream os = null;
	OutputStreamWriter osw=null;
	BufferedWriter bw = null;
	
	final String telcorp[] = {"skt","kt","lgt","알뜰폰"};
	
	private void check_members() throws Exception {
		
		File f = new File(this.url);								//원본
		File f2 = new File(this.copys);									//경로
		
		 
		try {
			
			
			
			int w=0;
			while(w < this.telcorp.length) {
				
				//f2.createNewFile(this.telcrop[w]+".csv");
				
				String newfile = f2 + this.telcorp[w]+".csv";
				
								
				//this.os = new FileOutputStream(newfile);
				//this.os.write(w);
				
				w++;
			}
		}
		catch(Exception e) {
			
		}
		finally {
			
			this.os.close();
		}
		
	}

	
	
	
	public csv_members(){
		
		
		
		
	/*	this.dto.setNm("hong");
		String username = this.dto.getNm();
		System.out.println(username);
		*/
		
		this.dto = new io_DTO();
		
		File f = new File(url);
		
		try {
			
			this.check_members();
			
		}catch(Exception e) {
			System.out.println("");
		}
		finally {
			
		}
		
	}
}







