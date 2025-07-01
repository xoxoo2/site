package method;

//멀티 쓰레드 운영방법

public class th1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		th1_box th = new th1_box();
		th.aaa();							//aaa메소드 모두 실행 후  bbb실행 단일 쓰레드
		th.bbb();
		
/*		mth1_box mb = new mth1_box();
		
		
		
		Thread th = new Thread(mb);
		th.start();
*/
		
		int w =0;
		while(w <=1000) {
			
			mth1_box mb = new mth1_box();
			//먼저 ㅊ끝난 값을 출력시키는 형태가 됩니다.
			
			mb.aaa(w);
			
			//thread 클래스를 호출 후 run 메소드를 작동시키기 위하여 start()
			
			Thread th = new Thread(mb);
			th.start();						//run 메소드를 각각의 thread로 실행시키기 위함
			
		
		
		//mb.bbb(w);
		w++;
	
	}

}


										//멀티 쓰레드 형태

class mth1_box extends Thread{						//thread  클래스를 상속 받음
	
	int no;	
	public void aaa(int w) {
		this.no = w;
		
	/*	int w=0;
		while(w<=100) {
			System.out.print(());		*/
		
		}
		
		@Override
		public void run() {						//멀티 쓰레드를 사용할 수 있도록 하는 메소드
			
			try {
				Thread.sleep(2000);								//쓰레드를 일시 정지 시킨는 메소드 : 1000 = 1초
				System.out.println(this.no);
			}catch(Exception e){
				System.out.println("Tread에 문제가 발생 하였습니다.");
			}
			
			
			
			
			
			
			//super.run();
			this.aaa;
	}
	
	
	
	

	}
	
	
}


/*
 
  int w = 0;
  while(w<=100){
  		mth1_box mb = new mth1_box();
  
  
  		//먼저 끝난 값을 출력시큰ㄴ 형태가 됩니다.
  		 mb.aaa(w);
  		 
  		  thread 클래스를 호출 후 run 메소드를 작동시키기 위하여 start()
  		  
  		  thread th = new thread(mb);
  		  th.start();
  	
  
  
 멀티스레드 = 먼저 긑난 값을 출력시키는 형태
 단일 스레드로 데이터를 출력시 무조건 순서대로 값이 출력
  
 */




class th1_box{
	public void aaa() {
		int w = 0;
		while(w <= 100) {
			
			System.out.println("a메소드:"+w);
			w++;
		}
	}
	
	public void bbb() {
		int w = 0;
		
		while(w<=100)	{
			
		}
			
		
	}
	
	
}