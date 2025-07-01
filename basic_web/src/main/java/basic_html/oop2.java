package basic_html;

public class oop2 {
	
	//필드 공간에 전역변수를 선언하여 셋팅, 객체, 외부 class 호출
	
	String user = "홍길동";
	
	
	
	
	
	
	public static void main(String[] args) {
		int point = 8000; 							//지역변수
		// TODO Auto-generated method stub
		
		String money = "9000";
		String delivery = "3000";
		int sum = Integer.parseInt(money) + Integer.parseInt(delivery);

		
		//Interger.parseInt : 문자 -> 숫자로 변환하는 클래스
		//Int sum = Integer.pasol
		
		
		System.out.println(sum);
		
		
		
	}

}
