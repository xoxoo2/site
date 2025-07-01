package re_html;								//그룹

public class re_java1 {								//클래스를 무조건 사용해야함  그래야 메소드사용 가능
	
	
	//메인 메소드

	public static void main(String[] args) {
		String data1 = "hong";
		String data2 = "25";
		re_box1 rb= new re_box1(data1,data2);
		rb.check();
		

	}

}

//java 메소드는 같은 이름 또는 같은 자료형이라도 매개변수의 종류 따라 다르게 인식함



class re_box1{
	

	protected re_box1(String data1, String data2) {						//setter
			this.a = data1;													//필드에 적용된 사항 this를 사용함
			this.b = data2;
			this.check();
			
		}
		protected re_box1(String data1) {
			this.a = data1;
			
			
		}
		
		// 일반 void apthem (return X) 
		
		public void check() {
			System.out.println(this.a);
			this.level();
			
			String zzz = this.level();								//return 함수를 호출 후 결과값을 받는 코드
			System.out.println(zzz);							//결과값을 출력하는 코드
			
			
		}
		public String level() {
			
			
			String levels = "";									//return에서 결과값을 사용할 변수
			
			
			
			if(this.a == "hong") {
				
				levels = "실버회원";
				
				
			}
			else {
				levels = "비회원";
				
			}
			
			
			return levels;
		}
		
																				//일반 void 메소드 (return X)
		
	
}