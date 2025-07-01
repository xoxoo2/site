package basic_html;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex2_box eb = new ex2_box();
		eb.exbox();										//finally 사용방법
		eb.exbox2();
		

	}

}

class ex2_box{
	Scanner sc = null;										//필드에는 try~catch를 사용하지 않음
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void exbox2() {
		//replace, replaceAll
		String word = "a,b,c,d,";
		
		
		
		
		String a = "5000";
		int b = 0;
		
		
		try {
			b = b + Integer.parseInt(a);	
		}
		
		
		
		catch(NumberFormatException ne) {
			a = a.replaceAll("[a-z]","");
			b = b + Integer.parseInt(a);
		}
		
		
		
		
		
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("최종 결과값 :" + b);
		
	}

	
	
	
	
	
	
	
	public void exbox() {
		this.sc = new Scanner(System.in);
		System.out.print("사용자 이름을 입력하세요: ");
		
		
		try {
			//Scanner sc = new Scanner(System.in);
			String user = this.sc.next();
			if(user.equals("")|| user.equals(null)) {
				System.out.println("사용자 미입력!!");
			}
			
			else {
				System.out.println("연락처를 입력하세요 단 '-' 없이 사용 ");
				Integer tel = this.sc.nextInt();
				System.out.print(tel);
			}
			
			this.sc.close();
			
			
		}
		catch(Exception e) {
			System.out.print(e);
			
		}
		
		finally {						//finally는 try와 catch 실행시 무조건 실행되는 프로세서 종료
			this.sc.close();
			System.out.println("finally는 무조건 작동되는 메소드");
		}
		
		
		
	}
}




/* 사용자가 다음과 같이 은행 금액을 입금하는 프로세서 입니다.
 * 문제가 발생시 숫자만 입력 받을 수 있도록 처리ㅏ는 예외처리 코드를 작성하시오.
 
  [결과]
  
  "입금하실 금액을 입력하세요 : aaa"
  "숫자만 입력하셔야 합니다."
  "입금하실 금액을 입력하세요 : 5000"
  "입금하신 금액은 : 5000 입니다."
  
  
  
  

 */

public class ex3{
	
	public static void main (String[] args) {
		ex3_bank eb = new ex3_bank();
		eb.deposit();
		
	}
}


class ex3_bank{
	
	Scanner sc = null;
	
	public void deposit() {
		
		this.sc.new Scanner(System.in);
		
		int money = 0;
		
		try {
			money = this.sc.nextInt();
			System.out.println("입금한 금액은 : " + money );
		}
		catch(InputMismatchException ie) {
			System.out.println("숫자만 입력하셔야 합니다.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			this.sc.close();
			System.out.println("입금하실 금액을 입력하세요 : " + money );
		}
		
	}
	
	
}