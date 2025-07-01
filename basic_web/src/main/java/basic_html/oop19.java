package basic_html;




import java.util.Scanner;





import basic.code_data;



//제귀함수 + 접근 제한자 설정법  (basic_html12 > code_data.java 연계)


public class oop19 {

	public static void main(String[] args) {
		
		
		code_data cd = new 
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("제 호출을 하시겠습니까?");
		String result = sc.next();
		if(result.equals("Y")) {
			//main(args);						//매개변수 형태가 있을 경우 해당 인자값에 적용 후 재귀함수를 사용합니다.
			
			new oop19().main(args);
			
		}
		
		else {
			System.out.println("종료 하였습니다.");
			
		}
		sc.close();
		
		
		
/*		oop19_box ob = new oop19_box();
		ob.recall();
		*/

	}

}


class oop19_box{
	Scanner sc = null;
	
	
	public void recall() {
		this.sc = new Scanner(System.in);
		System.out.println("1.재호출, 2.강제종료 :");
		int n = this.sc.nextInt();
		if(n == 2) {
			System.exit(0);				//강제 종료	
			
		}
		
		else {
			System.out.println("숫자를 입력하세요 단, 0을 입력시 처음으로 돌아갑니다.: ");
			int z = this.sc.nextInt();
			if(z==0) {
				recall();							//자신의 메소드를 다시 재호출 (재귀함수)
			}
			else {
				System.out.println(z);
			}
		}
		
		
	}
	
	
	
	
}