package basic_html;

import java.util.Scanner;

// 반복문 + Scanner를 이용한 bank 시스템

/*  추가 업무 코드를 제작합니다
  메뉴가 변경 요청을 하셔야 합니다.
  
  1.잔액확인, 2.입금,  3.출금,  4.종료  => 변경 요청
  
  잔액 확인을 선택 하였을 경우
  
  현재 통장 잔액은 : 100000 출력이 되어야 합니다.
  
  
  
  출금을 선택 하였을 경우
  
  " 출금하실 금액을 입력하세요 : "
  
  단, 잔액보다 큰 금액을 입력시 " 잔액 액수가 부족합니다. " 
  잔액보다 적은 금액을 입력시 사용자가 입력한 금액 - 잔액을 적용하여 
 
 
 
 */






public class opp17 {

	public static void main(String[] args) {
		oop17_bank ob = new oop17_bank();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입금 , 2. 출금 , 3. 종료번호를 입력하세요 : ");
		int no = sc.nextInt();
		
		if(no == 1  || no ==2 || no ==3) {
			switch(no) {
			case 1:
				ob.deposit(); 										//1번 입력시 해당 메소드로 이동
				
			break;
			}
			
			default:
			
		}
		else {
			System.out.println("해당 번호가 아닙니다. 종료하겠습니다.");
			
		}

	}

}

class oop17_bank{
	int money = 100000;				//통장에 10만원 입금된 상황
	Scanner sc2 = null;
	public void deposit(){
		this.sc2 = new Scanner(System.in);
		System.out.println("입금 하실 금앨을 입력하세요 : ");
		
		
		int money2 = this.sc2.nextInt();								//사용자가 입금하는 금액
		this.money = this.money + money2;
		System.out.println("입금이 완료 되었습니다.");
		System.out.println("최종 금액 : " + this.money);
		
	}
	
	
	
}
