package basic_html;

import java.util.Scanner;


/* scanner 를 이용하여 if문 사용하기
 * 
 * 
 * scanner 사용시 주의사항
 * 
 * 1.close를 사용시 system.in이 dead 가 되면서 더 이상 사용하지 못함
 * 
 * nextLine을 사용 후 자료형이 변화 되었을 경우 다시 nextLine 을 사용하지 못함
 */






public class oop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oop14_box ob = new oop14_box();
		ob.login();
		ob.member();
		ob.sc.close();

	}

}

class oop14_box{							
	String id;													//전역변수
	
	
	Scanner sc = new Scanner(System.in);				//사용자가 입력한 Systme.in 자체가 닫혀야함			//모든 메소드에 해당 클래스에 대한 객체를 활용할 수 있음
	
	
	public void member() {
		
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("인증번호를 입력하세요 : ");
		
		
		String code = this.sc.next();
		System.out.println(code);
		this.sc.close();
		
	}
	
	public void login() {
		System.out.println("아이디를 입력하세요 : ");
		
		
		this.id = this.sc.nextLine().intern();				
		
		
		/*		equals : 사용자가 직접 값을 입력하는 사항, Front쪽에서 값을 이관받을때 사용	
		==(연산기호) : 변수에 직접 개발자 값을 넣을 경우	
		.intern(); 연산기호로 핸들링 한다는 메소드 입니다		*/
		
		
		
		
		
		
		if(this.id == "hong") {									
			System.out.println("가입된 사용자");
			
		}
		
		else {
			System.out.println("미가입자");
		}
		
		
		
																	//숫자는 연산기호 모두 핸들링을 합니다
		
		System.out.println("사용자의 나이를 입력하세요 : ");
		
		
		int age = this.sc.nextInt();
		if (age < 14) {
			System.out.println("14세 미만은 가입이 되지 않습니다.");
		}
		else {
			System.out.println("14세 이상 입니다.");
		}
	}
	
}
