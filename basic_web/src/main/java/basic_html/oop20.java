package basic_html;
//private로 변수값 핸들링



public class oop20 {

	public static void main(String[] args) {
		oop20_box ob = new oop20_box("admin");
		
		//ob.login_level();

	}

}

class oop20_box{
	
										//private로 설정하여 외부 클래스에서 접근제한을 적용한 변수선언
	private String userid = null;
	private int level = 0;
	
	
	public oop20_box(String id)	{						//해당 즉시 실행 메소드에서만 접근 가능
		this.userid = id;
		int result = this.login_level();
		System.out.println(this.userid + ": 레벨권한" + result );
	
}
	
	public int login_level() {
		if(this.userid.equals("admin")) {
			this.level = 5;
		}
		
		
	}
	
	public int login_level() {
		if(this.userid.equals("admin")) {
			
		}
		
		
		return 0;
	}
	
	
}