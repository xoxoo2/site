package method;

/*
  각각의 클래스별로 멀티 스레드를 작동 시키는 형태

	멀티 스레드를 사용하는 이유는?
	1. 여러개의 작업환경을 나누어서 빠르게 처리하는 목적
	2. cpu 사용율을 향상 시켜서 자원을 보다 효율적으로 사용하는 목적 
	3. 오류가 발생하더라도 해당  thread 외에는 정상 작동을 하게 됩니다.


*/


public class th3 {

	public static void main(String[] args) {
		
													//각각의 class 별로 thread를 이용하여 작업을 분산하는 형태
		
		th3_abox th3 = new th3_abox();
		Thread tr1 = new Thread(th3);
		th4_abox th4 = new th4_abox();
		Thread tr2 = new Thread(th4);
		
		tr2.start();
		tr1.start();
	
		//new th3_abox().start();
		//new th4_abox().start();
		
		}
}


class th3_abox extends Thread{									//1thread
	
	int sum=0;

	@Override
		public void run() {
		
			for(int f=1; f<30000; f++) {
				
				this.sum = this.sum+f;
			}
			System.out.println("1~50까지 모두 더한 값 :" +this.sum);
		
				
			}
		
		}
	
	



class th4_abox extends Thread{									//2thread
	
	long sum=1;
	
	@Override
	public void run() {
		
		for(int f=1; f<51; f++) {
			this.sum = this.sum * f;
		}
		
		System.out.println("1~50까지 모두 곱한 값 :" + this.sum);
		
	}
	
}