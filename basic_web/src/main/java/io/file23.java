package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
  Stream + Reader, Writer + Bufferd

InputStream > BufferedReader (x)
InputStream > BufferedInputStream (o)
InputStreamReader < BufferedReader (o)
InputStream > InputStreamReader > BufferedReader (o)
FileinputSteam > BufferedReader		(x)

stream > reader X

*/

public class file23 {

	public static void main(String[] args) throws Exception {
		
		String url = "D:\\site\\basic_web\\src\\main\\java\\io\\paper.txt";
		File f = new File(url);
		
		FileOutputStream fs = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		FileInputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		
		try {
			
			/*
			FileOutputStream(byte로 최종 저장) 
			> OutputSteamWriter (String -> byte) 
			>BUfferedWriter(메모리에 문자를 등록)
			
			
			*/
			
			fs = new FileOutputStream(f,true);
			osw = new OutputStreamWriter(fs);
			bw = new BufferedWriter(osw);
			//FileWriter fw = new FileWriter(osw);
			
			bw.append("홍길동님 5000원 결제 되었습니다 \n");
			bw.newLine();									//=\n
			bw.append("삼성카드 5000원 결제!");
			
			
			
			//input 파일 로드
			is = new FileInputStream(f);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			//System.out.println(br.readLine());
			
			String txt = "";
			
			do {
				System.out.println(txt);
			}while((txt = br.readLine())!=null);
			
			
		}
		catch(Exception e) {
			
		}
		finally {
			/*
			bw.close();
			osw.close();
			fs.close();
			
			null can't be close
			*/
			br.close();
			isr.close();
			is.close();
			
			
			
		}

	}

}
