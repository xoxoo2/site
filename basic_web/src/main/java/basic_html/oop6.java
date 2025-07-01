package basic_html;
//메소드 형태


public class oop6 {
	
	
	public static void main(String[] args) {
		oop6_box ob = new oop6_box();
		ob.aaa();
		ob.aaa("홍길동");
		ob.aaa(25);
		String result = ob.aaa(10,20);			//int result= ob.aaa(10,20); XX
		System.out.println(result);
		int result2 = ob.aaa("honggilldong", " 01023456789");
		System.out.println();
		
	}
	
}

class oop6_box{
	public oop6_box(){		//즉시실행 메소드
		System.out.println("즉시 실행 메소드");
		
	}
	
	//메소드명은 동일하게 사용할 수 있습니다. 단, 조건 매개변수에 할당되는 자료형 구분
	
	public void aaa(){		//일반 메소드	
		System.out.println("일반 메소드 실행 !!");
	}
	public void aaa(String a){		//문자를 할당 받는 메소드
		System.out.println("일반 메소드 : + " + a);
	}	
	public void aaa(int a){		// 숫자를 할당 받는 메소드
		System.out.println("일반 메소드 : + " + a);
	}		
	public String aaa(int a, int b)  {			//return method
		int sum = a + b;
		String msg = "";
		
		if(sum % 2 ==0) {			
			
			
		}
		else{
			msg = "홀수값";
						
			
		}
		return msg; //return null;			// return sum; X  no return
	}
	
	
	/* 자료형 return 메소드이며, 해당 return에 동일한 자료형 데이터를 return 하셔야 합니다. */
	
	public int aaa(String a, String b) {
		
		int z = 1;
		return z;
	}
	
	
}