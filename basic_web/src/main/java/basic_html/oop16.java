package basic_html;

import java.util.Scanner;

//더블 반복문 (for,while, do~while)








public class oop16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oop16_box ob = new oop16_box();
	}

}
class oop16_box{
	int f, ff;
	

	
	/*
	응용문제

	사용자가 구구단 단수를 입력하게 됩니다.
	"시작 단수 : 5"
	"종료 단수 : 7"

	"구구단 범위 정수 :	3"

	[결과]

	5*1
	5*2
	5*3
	5*1
	5*2
	5*3


	*/
	
	
	
	
	
	
	
	
	
	
	
	
	public void users() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 단수 :");
		int user1 = sc.nextInt();
		
		System.out.println("종류 단수 :");
		int user2 = sc.nextInt();
		
		System.out.println("구구단 범위 정수 :");
		int user3 = sc.nextInt();
		for(this.f = user1; this.f<= user2; this.f++) {
			
			for(this.ff = 1; this.ff <= user3; this.ff++) {
				System.out.println(f+ "*" + ff+ "=" + f*ff);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	public void fors() {
		for(this.f = 2; this.f < 10 ; this.f++) {				//2~9
			for(this.ff=1; this.ff <=9; this.ff++) {
				System.out.println(f+ "*" + ff+ "=" + f*ff);
			}
		}
		
	}
	
	public void whiles() {
		this.f = 2;
		
		
		while(this.f <= 9) {				//2~9
			
			
			this.ff = 1;
			while(this.ff <= 9) {
				System.out.println(f+ "*" + ff + "=" + f*ff);
				
			}	
			this.f++;
			
			
		}
		
	}
	
	
	
	public void dowhiles() {
		this.f = 2;
		do {
			System.out.println();
			this.ff++;
			
			
			
			
		}while(this.f <= 9);
		
		this.f++;
		
		
	}
	
	
}








