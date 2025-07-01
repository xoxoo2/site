package basic_html;

//if문 사용법


public class oop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		string box = "";
				
		oop7_box ob = new oop7_box();
		ob.login();
	}

}


class oop7_box{
	
	/*
	 * 응용문제.
	   
	   메인 메소드에서 인자값으로 33 42 82를 외부 클래스로 전달 합니다.
	   해당 숫자를 모두 곱한 후 짝수인지, 홀수인지를 return 결과값을 출력 시키시오. 
	
	
	
	int a = 33;
	int b = 42;
	int c = 82;

	
	value = a*B*C
	
	
	}
	
while()  {
			value % 2 == 1
			
			 System.out.println("홀수 입니다.");
			 }
	
	
	else{
			value % 2 == 0
			
			 System.out.println("짝수 입니다.");
	
	}
	
	
	return;
	
	
	vlaue();
	
	
	
	 
	 
	 응용문제 3
	 
	 이메일 : hong@nate.com  과 고객명 : 홍길동을 외부 클래스로 전달 할 경우
	 두 값이 모두 일치 할 경우 return으로 "해당 고객정보릃 ㅗ강니 하였습니다." 라는 결과값을 출력하며,
	 두가지 값 중 한가지라도 다를 경우  " 일치하는 고객정보강 벗습니다." 라고 출력 되도록 하시오.
	 
	 */
	 
	 
	 
	 
	 
	
	  
	 */
	
	
	
	
	
	
	
	
	public void login(String mname) {
		String mid = "hong";
		String mpass = "a1234";
		
	/* equals == 두가지의 뜻이 동일하며, 단 equals 문자에만 사용합니다.
		 	숫자를 비교하는 사항 == 만 이용합니다.
		&& (and) || (or) 조건문에서 사용하는 연산기호 */
		
		if(mid ==  "hong" &&  mname.equals ("홍길동")) {
			
			System.out.println("아이디 확인");
			
		}
		else {
			System.out.println("아이디 미확인");
			
		}
		
		if(mpass.equals("b1234")) {
			System.out.println("패스워드가 다릅니다.");
			
		}
		else {
			System.out.println("패스워드가 같습니다.");
			
		}
		
		int no = 500;
		if (no==500) {
			
			
		}
			
		
	}
	
	
}















