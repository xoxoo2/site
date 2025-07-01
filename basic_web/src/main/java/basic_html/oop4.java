package basic_html;


//메모리 종류 : ROM, RAM  => 캐시 메모리, 메모리
//필드에 있는 변수 핸들링 및 지역변수 핸들링

public class oop4 {
	
	//static : 메모리에 해당 변수를 저장	/ 무조건 필드에만 적용함
	
	static String user= "홍길동";
	
	//메모리에 저장된 메소드

	public static void main(String[] args) {
		
		System.out.println(user);			//같은 메모리상에서 해당 변수를 호출	//static > this. 존재 X
		oop4_box pb = new oop4_box();
		
		//외부 클래스에 있는 필드에 있는 변수의 값을 변경 할 수 있으며, 가져올 수 있음
		
		pb.product = "김치 냉장고";
		pb.money = 600000;
		pb.aaa();
		
		
		
		// TODO Auto-generated method stub

	}

}


class oop4_box{
	String product = "냉장고";
	static int money = 500000;			//메모리에 해당 변수를 등록
	
	
	//단, 외부 클래스를 이용하여 메소드를 실행 전역변수를 호출할 경우 this 또는 변수명으로  static
	
	public void aaa() {
		
		System.out.println("상품가격 : " + this.money);  		//메모리 전역 변수
		System.out.println(this.product);		//일반 전역 변수를 호출 	//this.  : 매우 중요
		System.out.println("실행!!");
		
		this.bbb(); 
	} 
	public void bbb() {
		
		//메인 클래스를 객체화 하여, 해당 필드에 있는 변수를 호출함
		
		oop4 po4 = new oop4();
		System.out.println(po4.user);
	}
	
}