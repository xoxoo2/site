package io;

import java.io.FileWriter;

public class file5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			new file5_box().fileWrite();
			
		}catch(Exception e) {
			System.out.println("");
		}

	}

}


class cile5_box{
	String url = "D:\\site\\basic_web\\src\\main\\java\\io\\gugu.txt";			//저장경로
	FileWriter fw = null;														//저장 라이브러리
	
	
	public void filewrite() throws Exception {						//throws exception : try~catch 없이 운용이 가능함
		this.fw = new FileWriter(this.url,false);					//기존 데이터는 삭제 후데이터를 저장
		
		int w = 1;
		do {
			
			String sum = "8 * " + w + "=" + 8*w;
			this.fw.write(sum + "n");								//반복문의 결과값을 해당 파일 쓰기
			
			w++;
		}while(w<10);
		
		this.fw.close();												//라이브러리 종료
		
	}
	
}