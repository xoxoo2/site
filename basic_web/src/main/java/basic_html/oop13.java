package basic_html;

import java.util.Scanner;

//메모리 지정 변수, 일반 전역변수 차이점

public class oop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	/*	oop13_box ob = new oop13_box();
		ob.aaa();
		// ob.aaa();	*/
		
		oop13_box ob2 = new oop13_box();
		ob2.bbb();
		
		
		
		
		oop13_box ob3 = new oop13_box();
		ob3.ccc();
		
		
	
		
		//new  => 클래스를 호출시 일반 변수는 새롭게 인식, static 기존값을 기억 시킵니다.

	}

}

class oop13_box{
	
	int a = 1;											//메모리가 실행시 적용되는 변수
	static int b = 1;									//메모리에 저장되는 변수
	
	public void ccc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요 : ");
		
		int number = sc.nextInt();
		System.out.println(number);
		
		System.out.println("소수점을 입력하세요 : ");
		float sosu = sc.nextFloat();
		
		
		System.out.println(sosu);
		
		sc.close();
		
	}
	
	
	
	public void bbb() {
		Scanner sc = new Scanner(System.in);						//가상으로 사용자가 입력을 받을 수 있는 클래스
		System.out.println("고객명을 입력하세요 : ");
		
		//String user = sc.next();								//next, nextLine : 문자, 숫자 입력값을 받는 역할 next(공백X), nextlien(공백O)
		
		String user = sc.nextLine();						//사용자가 입력한 값을 자료형 변수를 이관
		System.out.println(user);
		sc.close();  										//입력 클래스 라이브러리라  we have to use ".close();".
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	/*
	public void aaa() {
		this.a++;
		this.b++;
		System.out.println("일반변수 :" + this.a);
		System.out.println("메모리변수 :" + this.b);
		
		
	}
}

*/