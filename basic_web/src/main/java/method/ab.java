package method;

/* main controller + abstract	(오버라이딩(override)   :  상속 메소드 외에 개발자가 별도로 메소드를 구성, 오버리드 : 상속 메소드 )
extends : 외부 클래스를 상속 받아서 처리 */


public class ab extends ab1_box1 {

	public static void main(String[] args) {
		abox1();
		

	}

}


class ab1_box1 {
	public void abox1() {
		System.out.println("일반 메소드를 호출!!");	}
}




//abstract : 추상 클래스

abstract class ab2_box1{
	public void aaa() {};
	public String bbb() { return null; };
	public Integer ccc() { return 0; };
}


//일반 class에 추상클래스를 상속 받아서 @override를 이용하여 필요한 메소드를 구성하여 코드를 작성

class ab2_class extends ab2_box1{
	
	@Override								//추상 클래스에서 상속된 메소드를 호출
	public void aaa() {
		//this.userid : 추상클래스에서 필드에 생성되 ㄴ변수를 가져와서 적용
		// TODO Auto-generated method stub
		super.aaa();
	}
	@override
	public String bbb() {
		// TODO Auto-generated method stub
		return super.bbb();
	}
	@override
	public Integer ccc() {
		// TODO Auto-generated method stub
		return super.ccc();
	}
	
	
	//overriding : 추상클래승서 선언한 메소드 외에 별도로 개발자가 메소드를 생성한 사항
	public ArrayList<String> ddd(){
		return null;
	}
	
}


class ab3_class extends ab2_box1{
	@override
	public void aaa() {
		this.user id =0;
		
		System.out.println(userid);
		super.aaa();
	}
	
}
