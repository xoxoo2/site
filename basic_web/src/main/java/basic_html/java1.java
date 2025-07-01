package basic_html;


/*
 
 1.java : class, method를 잘 관리
 2.cpu : 쓰레드(thread)
 3.memory : 메모리 관리
 
 * 
 */



//public class 사용시 같은 파일에 두개의 public는 없음
//class 명은 절대 중복 되면 안됨


public class java1 {							//기본 class
	
	
	
		//main method
	//static: 메모리에 저장시켜서 사용하는 자료형
	
	
	public static void mail(String[] args) {
		
		//string~double : 데이터형 (byte)
		
		String user = "홍길동";			//문자 변수를 선언하여 데이터를 이관
		
		int age = 25;  					//숫자 (정수)
		
		Integer point = 5000; 			//숫자열(class)
		//float (4 byte) < double (8 byte)
		
		
		float money = 25.5f ;					//소수점(실수)
		
		double sales = 0.8;						//소수점
		
		
		// float을 사용시 결과값은     double, float를 자료형을 선언
		int sum = age + point; 			//정수 -> int, Integer
		float sum2 = point * money;
		System.out.println(sum2);
		
		
		
		String msg = " 님 환영합니다.";
		
		/*	String no1 ="25";
		String no2 = "50";		*/		
		
		
		String login = user + msg;
		System.out.println(login);		
		

		System.out.printf("출력 테스트!!" );
		System.out.printf("%님 로그인 되셨습니다. 포인트는 : %d %n", user, point);

		
		
		
		boolean ck = true;  //true, false
		
		
		
		// 숫자 : byte(127)  < short < int < long
		
		
		short no = 32000;				//short : 3만까지 숫자
		long no2	= 5000000L;			//L을 데이터 맨 뒤에 위치를 시켜서 사용
		System.out.println(no);
		char agree = 'Y';				//char 한글자를 입력시키는 자료형 ''입력
		


		/* java 자료형은 데이터 범위 존재함			*/
		
	}
	

	
}




	