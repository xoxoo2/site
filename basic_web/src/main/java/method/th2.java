package method;

//멀티 스레드 interface

public class th2 {

	public static void main(String[] args) {
		
		for(int f=0; f<10; f++) {
			th2_box th = new th2_box(f);
			Thread tr = new Thread(th);
			
			try {
				
				tr.sleep(2000);
				tr.start();
				
			}catch(Exception e) {
				System.out.println("CPU 쓰레드중 하나가 문제가 발생 하였습니다.");
			}
		}	
	}

}



//runnable 멀티 스레드 interface 사용하는방법




class th2_box implements Runnable{
	
	int n =0;
	public th2_box(int z) {
		this.n =z;
	}
	
	
	
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
			System.out.println(this.n);
			
		}catch() {
			
		}
		
		
		
		
	}
	   
}









/*

for(int f=0; f<10; f++) {
	
	th2_box th = new th2_box(f);
	Thread tr = new Thread(th);
	
	interface로 thread에서 객체를 설정하여 로드하는 방식
	
	

Runnable ra = new th2_box(f);
Thread tr = new Thread(ra);

*/