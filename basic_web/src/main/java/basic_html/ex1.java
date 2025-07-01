package basic_html;

import java.util.InputMismatchException;

//Exception : 예외처리 방식


/*
 1. 사용자가 입력실수로 인하여 잘못된 값을 입력하였을 경우
 2. 개발자가 프로그램 오류시 정확한 오류를 파악하기위한 수단
 3. 강제 프로세서에 대한 정보 수정 및 오류를 처리하기 위한 수단
 
 */




public class ex1 {

	public static void main(String[] args) {
		

		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해 주세요 : ");
			int b = sc.nextInt();
			

	/*		String a = null;
		int b = Integer.parseInt(a);		
		
	catch : 문제 발생 부분		
			*/
	

		
		System.out.println("숫자는 :" +b);			
		}
		
		catch(InputMismatchException ime) {
			System.out.println("숫자만 입력하셔야 합니다.");
		}
		
		catch(NumberFormatException ne) {
			System.out.println("문자를 숫자로 변경되는 사항 오류발생!!");
		}

		
	catch(Exception e) {										//exception : 모든 오류가 발생시 체크
		System.out.println(e);									//어떤 오류가 발생하였는지 예외처리 종류
		e.printStackTrace();             						//오류 발생시 코드 라인을 체크
		System.out.println("오류발생!!");
	}

}
}


//try ~ catch : 예외처리 문법
//Exception(부모 클래스):   NumberFormatException(자식 클래스)





