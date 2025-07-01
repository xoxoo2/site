package method;

/*
 
 응용문제
 
 추상 클래스를 이용하여 입,출금이 가능하는 프로ㅔ서를 제작 합니다.
 다음과 같이 프로세서가 진행 됩니다.

"은행 메뉴를 선택해 주세요 : 1.신한" , "2.농협" , "3.국민" , "4.하나"  : "

단 2번을 선택시 "현재 농협은 시스템 점검으로 서비스가 되지 않습니다."

그외에 사항은 다음과 같습니다.
"입/출금 메뉴를 선택하세요 : 1.입금 , 2.출금 "
"입금 금액을 입력하세요 : " 또는 "출금 금액을 입력하세요 : "
종료를 선택시 "입/출금 업무를 종료 합니다."


통장잔고 금액 : 10000이 적용되어 있으며, 단 해당 은행은 국민은행 입니다.
 */



import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ab_box3 {
	Integer total = 0;			//잔액을 설정하는 변수
	final String menus[] = {"1.신한" , "2.농협" , "3.국민" , "4.하나"};
	
	Scanner sc = new Scanner(System.in);
	ArrayList<ArrayList<String>> bank = null;
	ArrayList<String>	acc = null;
	
	
	
	public String today() {				//일자
		Date day = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		return sf.format(day);
		
	}
	
	public abstract String deposit(int money);		//입금 메소드
	public abstract String drawal(int money);		//출금 메소드

}
