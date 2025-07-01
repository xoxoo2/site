package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file18 {

	public static void main(String[] args) {
		img_copy

	}

}



class img_copy{
	
	String ori = "D:\\site\\basic_web\\src\\main\\java\\io\\";			//원본이미지 경로
	String dc = "D:\\copy\\";												//사본이미지가 저장될 경로
	
	FileInputStream fs = null;
	FileInputStream os = null;
	
	
	String filenm[] = {"pd1.png","pd2.jpeg","pd3.jpg","pd4,png"};
	byte by[] = null;													//파일을 읽어서 처리하는 변수
	
	
	public img_copy() {											//즉시실행 /해당 코드는 경로만 있는상황이므로  stream 자체가 작동하지 않습니다 
		
		try {
			this.fs = new FileInputStream(ori);
			this.os = new FileOutputStream(dc);
		}catch(Exception e) {
			System.out.println("해당 경로를 확인하지 못하였습니다");
		}
		
		
		this.imgcopy();
		
	}
	
	public void imgcopy() {												//이미지를 복사하는 메소드(다른경로
		
		try {
			
			int w=0;	
			while(w<this.filenm.length){
			
				this.fs = new FileInputStream(ori+this.filenm[w]);				//경로+파일명
				this.by = new byte[this.fs.available()];
				
				this.fs.read(this.by);							//매우중요 /byte 용량을 모두 읽어들임
				
				this.os = new FileOutputStream(dc + this.filenm[w]);
				this.os.write(this.by);									//해당 byte 용량에 맞춰서 저장
				this.os.flush();										//캐시 메모리
				
				
				w++;			
		}
			System.out.println("");
		}catch(Exception e) {
			System.out.println("해당 파일 중 경로 및 파일명이 올바르지 않습니다.");
		
		}finally {
			try {
				this.os.close();
				this.fs.close();
			}
			catch(Exception e) {
				System.out.println("");
			}
	
		}
		
	}
	
}