package basic_html;


//외부 라이브러리를 가져오는 
import java.util.Scanner;

/* scanner를 이용하여 반복문 사용
 
 
 
 응용문제 사용자가 숫자를 하나 입려고합니다. 해당 구구단이 추력 되도록 합니다.
 
 예시) 
 
 "구구단 수를 입력하세요 : 4"
 
 4
 8
 12
 16
 20
 
 
 */
 
 
/*

class oop15_box{
	

	Scanner sc = new Scanner(System.in);
	
	int hi;
	
	
	public void gugu() {
		
		System.out.println("구구단 수를 입력하세요 : ");
		
		String code = this.sc.next();
		System.out.println(code);
		this.sc.close();
	
	
	  for (num=0; num <10; num++) {
		
		  int num;
		  
		  System.out.println(num*hi);	
		
	}	 
	
	}	
}

 
 */







public class oop15 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oop15_box ob = new oop15_box();
		ob.gugu();
		
	}

}


class oop15_box{
	Scanner sc = null;											//객체만 사용하도록 셋팅
	int no = 0;
	
	public void gugu() {
		System.out.println("구구단 숫자를 입력하세요 :");
		this.sc = new Scanner(System.in);						//해당 메소드 호출 시 인스턴스 실행
		this.no = this.sc.nextInt();
		int w = 1;
		do {
			
			System.out.println(this.no*w);
			
		}While(w<10);
	}
	
	
}





/*
 

 응용문제
 
 총 5번의 숫자를 입력하는 코드를 작성합니다.
 "숫자를 입력하세요:" 해당 문구 5번 발생
 
 
 사용자가 총 5번 입력된  숫자의 모든 합을 구하는 코드를 작성합니다.
 
 숫자를 입력하세요 : 5
 숫자를 입력하세요 : 8
 숫자를 입력하세요 : 1
 숫자를 입력하세요 : 3
 숫자를 입력하세요 : 4

 
 */



class oop15_Box{
	Scanner sc = null;
			int no = 0;
	
	public void total() {
		this.sc = new Scanner(System.in);
		int f;
		for(f=1; f<6; f++) {
			System.out.println("숫자를 입력하세요 : ");
			sum = sum + this.sc.nextInt();					//사용자가 입력한 값을 누적시킴
		}
		System.out.println("총 합계 : " + sum);
		
	}
	
	
}
