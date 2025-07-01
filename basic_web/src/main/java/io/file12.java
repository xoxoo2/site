package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

//io 응용편

/*

키오스크에서 오더 받은 내용을 같이 정리하여 order.txt로 저장 되도록 합니다.

[결과]

메뉴를 고르세요 : [1. 아이스커피 2. 아메리카노 3.캬라멜 마끼야또]	:	
아이스커피 : 2000원
아메리카노 : 3500원
캬라멜 마끼야또 : 4000원


[order.txt (.log) 에 다음 내용이 저장 되도록 합니다.]
신청하신 내용 : 아메리카노 
결제금액 : 3500





public class file12 {

	public static void main(String[] args) {
		
		String url = "D:\\site\\basic_web\\src\\main\\java\\io\\order.txt";
		
		File f1 = new File(url);
		
		
		String menu[] = {"1. 아이스커피 : 2000", "2. 아메리카노 : 3500", "3.캬라멜 마끼야또 : 4000"};
		
		
		
	
		try {
			
			f1.createNewFile(url);
			
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);	
			
			
			RandomAccessFile f3 = new RandomAccessFile(url,"w");
			
			
			br.close();
			
		}catch(Exception e) {
			System.out.println("파일을 가져올 수 없습니다.");
		}
		
		
	}

}

*/


public class file12 {

	public static void main(String[] args) {
		
		file12_box fb = new file12_box();
		
		
	}





class file12_box{
	final String data[][] = {
			{"1.아이스커피","2000"},
			{"2.아메리카노","3500"},
			{"3.캬라멜 마끼야또","4000"}
	};
	
	Scanner sc = null;
	FileWriter fw = null;
	BufferedReader br = null;
	
	int menu;											//변수만 선언									
	
	
	public file12_box() {
		this.sc = new Scanner(System.in);
		this.menulist();
	}
	
	
	
	private void menulist() {										//메뉴 리스트 출력 및 메뉴를 선택
		
		String menus = "";											//사용자에게 메뉴를 보여주는 형태
		
		for(int f=0; f<this.data.length; f++) {
			menus = menus + this.data[f][0] + " ";
			
			
		}
		System.out.printf("메뉴를 고르세요 [%s] : " , menus);
		
		try {
			
			this.menu = this.sc.nextInt();
			
			
			if(this.menu > 0 && this.menu < 4) {
				
				String result = this.receipt();
				if(result=="ok") {
					System.out.println("정상적으로 주문이 완료 되었습니다.");
				}
				else {
					System.out.println("서비스 장애로 다시 주문을 부탁 드립니다.");
				}
				
				
			}
			else {
				System.out.println("1~3번까지의 메뉴를 선택하셔야 합니다.");
				new file12_box();
				
			}
			
			
			
		}catch(Exception e) {										//메뉴선택에 대한 숫자외에 다른 문자를 입력시
			System.out.println("1~3번까지의 숫자를 입력하세요");
			new file12_box();
		}
		
		finally {
			this.sc.close();
		}
		
	}
		
	}

											//파일에 사용자가 선택한 메뉴관련 정보를 저장하는 메소드

		
		private String receipt() {
			
			String call = "no";										//해당 데이터를 올바르게 진행 결과를 return 변수
			String url = "D:\\site\\basic_web\\src\\main\\java\\io\\order.txt";
			
			try {														//정상적으로 해당 파일에 데이터가 저장 되었을 경우
				
				File f = new File(url);
				boolean check = f.createNewFile();				//파일신규(true), 같은파일 있을 경우(false)
				this.fw = new FileWriter(f);					//해당 경로에 파일에 데이터를 쓰기
				this.fw.write("신청하신메뉴 :" + [this.menu-1][0] + "n");
				this.fw.write("결제금액 : " + this.data[this.menu-1][1]+" 원");
				
				call ="ok";
				
			}catch(Exception e){											//IO문제 발생시
				System.out.println("해당 파일을 로드하지 못하였습니다.");
			}
			finally {													//IO를 종료하는 파트
				try {
					this.fw.close();									//FileWriter를 종료
				}catch(Exception e) {
					System.out.println("해당 파일을 정상적으로 종료하지 못하였습니다");
				}
				
			}
			
			return call;
		}
	



}

