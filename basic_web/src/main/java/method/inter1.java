package method;

public interface inter1 {

}



package method;

import java.util.Scanner;

// interface : 다른 클래스 사이의 중간 매개체 역할 담당하는 추상 클래스 의미 입니다.

//abstract와 비슷한 성격을 가지고 있음, 단 모든 메소들ㄹ 그룹화함




public class inter1 {

	//필드에 선언한 자료형 변수는 기본으로 상수를 선언하고 있습니다.
	
	String userid = "hong";
	static String username = "";								//빈값 class에서 활용할 수 없음
	Scanner sc = new Scanner(System.in);
	
	
	
	public String names(); 
	public Integer levels();
	
	public void search();
	
	//default : interface에서 유일하게 기본 메소드를 활용할 수 잇는 선언문
	
	default void setbox(String id) {
		
		this.userid = id;
		
	}
	
	default string getbox() {
		return null;
	}
	
}