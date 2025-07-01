package basic_html;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ex4 {

	public static void main(String[] args) throws Exception {
		ex4_box eb = new ex4_box();
		
		
		try {
		eb.abc(100, "300");
	}
	
		
	catch(Exception e) {
		
		System.out.println("A 개발자 코드");
		System.out.println(e);
		
		try {
			eb.abc(500, "600");
		}catch(Exception e2) {
			System.out.println(e2);
		}
	}

		
	/* B 개발자 쪽에서 문제가 발생시 확인하는 방법		
		*/
		
		try {
			eb.bbb("5500");						//인자값으로 bbb  매소드를 호출 값을 전송
			
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		
		
}
	

}


/* throws, throw : 외부 클래스에 있는 메소드를 호출 또는 전송, 회신 등 데이터 이관을 할 경우
문제점에 대한 정보를 서로 공유할 수 있도록 처리하는 메소드 입니다.
*/



class ex4_box{
	
	
	public void bbb(String a) throws Exception, NumberFormatException {
		int k = Integer.valueOf(a) + Integer.valueOf("200");
		System.out.println(k);
		
		//throw(throws XX) 는 예외처리가 발생되면, 상대에게 에러 코드를 전송하며, 재전송을 요청 할 수 있음
		
		
		Exception ep = new Exception();							//Exception 라이브러리 (예외처리)
		
		
		
		//throw == return과 비슷한 성격을 가진 단,  해당 throw는 메소드 기준으로 맨 아래에 작성
		throw ep;											
	}
	
	
	
	
	
	
	
	//throws Exception : 메소드에 적용하며, 해당 메소드를 호출시 무조건 예외처리 기준바임을 적용 후 호출을 해야 합니다.
	
	
	public void abc(int no, String z) throws Exception { 
		
		
		try {
			int sum = no + Integer.parseInt(z);
			System.out.println(sum);
	
		}
		
		catch (Exception e) {						//자신의 코드에서 문제가 발생한 사항
			System.out.println("B 개발자 코드");
			System.out.println(e);

		}
		
		
		int sum = no + Integer.parseInt(z);
		System.out.println(sum);
		
	}
}