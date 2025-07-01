package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

//stream 으로 이미지를 활용하는 형태

public class file17 {

	public static void main(String[] args) {
		//원본 이미지
		
		String ori_img = "D:\\site\\basic_web\\src\\main\\java\\io\\img.jpg"; 
		
		
		try {
			FileInputStream  fs = new FileInputStream(ori_img);
			
			//byte by[] = new byte[fs.available()];							//전체 복사			
			//byte by[] = new byte[fs.available()/10];						//부분 복사			
			//System.out.println(Arrays.toString(by));
			
			byte by[] = new byte[fs.available()/100];
			
			
			
			fs.read(by);												//파일 이미지 모두 읽어드림
			
			String copy_img = "D:\\site\\basic_web\\src\\main\\java\\io\\";				//사본 이미지 경로 및 파일명 (복사시 파일 속성을 강젤 변경하는 사항은
			
			FileOutputStream os = new FileOutputStream(copy_img+ "img2.jpg");
			
			int w=0;								//읽은 바이트 수
			int check =0;							// 읽은 횟수
			
			while(true){
				w = fs.read(by);									//전체 용량 / 100=> 전체파이 용량을 나눠서 읽어드림
				
				if(w==-1) {
					break;
				}
				else {
					
					os.write(by,0,w); 								//원본 이미지릅 복사 이미지로 copy함
					
				}
				
				check++;
				if(check %2 ==0) {											//progress 진행 상황
					System.out.println(check + "%");
				}
				
				
			}
			
			
			
			os.write(by);												//원본 이미지를 복사 이미지로 copy 함
			
			os.flush();
			os.close();
			fs.close();
			
		}
		catch(Exception e) {
			System.out.println("해당 이미지 경로가 잘못 되었습니다.");
		}

	}

}
