package basic_html;

/* Scanner와 여러형태의 메소드 응용편

응용문제

외부 클래스를 이용하여 사용자가 한의 숫자값을 입력합니다.
입력된 값이 짝수인지 홀수인지를 확인하는  return 메소드 코드를 작성하시오


[결과]


"숫자 하나를 입력하세요: 27"

"입력하신 결과는 홀수 입니다. =>  return 결과 출력



응용문제 2


다음 up&down 게임을 제작하게 됩니다.

1~10까지 숫자 => 7  전역변수를 외부에서 절대 변경 못하도록 적용합니다.
단, 정답까지 최대 기회는 3번 입니다.


숫자를 입력하세요 : 3
결과 :  up
숫자를 입력하세요 : 9
결과 :  down
숫자를 입력하세요 : 6
결과 :  down
숫자를 입력하세요 : 7
결과 :  정답


*/

public class oop21 {

	public static void main(String[] args) {
		
		oop21box ob = new oop21_box("admin");
		
		

	}

}




					System.out.println("숫자를 입력하시오.")







class oop21_box{


			private int n = 7;
			int num;
					
			if(	n < num) {
				System.out.println(" 결과 : up");
				
			}

			if ( n > num )	{
				System.out.println(" 결과 : down");		
			}
			
			if (n == num) {	
				System.out.println(" 결과 : win");	
				
			}
				

				
}	
				
				
				
