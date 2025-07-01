package method;

//추상 클래스 생성		(ab3.java와 연계)

public abstract class ab_box2 {
													//추상클래스에 사용된 일반 return 메소드
	public String today() {
		return null;
	}
	
	
													//추상 클래스에 사용된 추상 reutrn 메소드 단, {}사용안함
									//abstract 메소드는 상속 받을 경우 무조건  override 해야하는 메소드
	public abstract String produt();
	public void basket() {
		
	}
	public abstract void userbasket();
	

}


