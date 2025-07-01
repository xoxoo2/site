package method;

import java.util.ArrayList;
import java.util.List;

/*

응용문제


{10,65,33,22,19,31,26,87,94,21}

해당 원시 배열 값이 있습니다. 원시배열을 이용하여 멀티 스레드로 결과값을 출력하는 코들르 작성하시오.

[결과]

짝수만 모두 곱한 값을 출력하는 결과값
홀수만 모두 곱한 값을 출력하는 결과값

모든 배열의 값을 더한 출력 결과값

*/





/*

int data[]= {10,65,33,22,19,31,26,87,94,21};



class th4_abox extends Thread{									

int sum=0;

@Override
public void run() {

for(int n=1; n<; n++) {
	
	this.sum = this.sum+n;
}
System.out.println(" 짝수만 모두 곱한 값을 출력하는 결과값 :" +this.sum);

	
}

}			





class th4_abox extends Thread{									

int sum=0;

@Override
public void run() {

for(int f=1; f<; f++) {

if(){
	
	this.sum = this.sum+f;
	
	
	}
}
System.out.println("홀수만 모두 곱한 값을 출력하는 결과값 :" +this.sum);

	
}

}





class th4_abox extends Thread{									

long sum=1;




@Override
public void run() {



while(n%2==2){
this.sum = this.sum * n;
}

System.out.println("모든 배열의 값을 더한 출력 결과값 :" + this.sum);

}

}



*/












public class th4 {

	public static void main(String[] args) {
		
		Integer data[] = {10,65,33,22,19,31,26,87,94,21};
		
		List<Integer> all = new ArrayList<Integer>(ArrayList.ass);
		
		
		the4_box1 th1 = new th4_box1(all);
		Thread thr1 = new Thread(th1);
		
		the4_box2 th2 = new th4_box2(all;
		Thread thr2 = new Thread(th2);
		
		the4_box3 th3 = new th4_box3(all);
		Thread thr3 = new Thread(th3);
		
		
		thr1.start();
		thr2.start();
		thr3.start();
		//thr1.stop();
		

	}

}



class th4_box1 extends Thread{							//짝수값
	
	List<Integer> all= null;
	
	Integer sum = 1;
	
	public th4_box1(List<Integer> all) {
		this.all = all;
	}
	
	//class th4_bb extends operation{
		
	}
	
	@Override
	public void run() {
		
		for(Integer  f : this.all ) {
			
			if( f%2 == 0 ) {
				
				this.sum = this.sum + f ;
				
			}
			
			
		}
		System.out.println("최종 짝수값의 합계 : " + this.sum);
	}
}




class th4_box2 extends Thread{										//홀수값
	
	List<Integer> all= null;
	long sum = 1L;												//마이너스 발생시 /합계구할때
	
	public th4_box2(List<Integer>all) {
		this.all = all;
	}
	
	@Override
	public void run() {
		
			for(Integer f : this.all ) {
			
			if( f%2 == 1 ) {
				
				this.sum = this.sum * f ;
				
			}
			
			
		}
		System.out.println("최종 홀수값의 합계 : " + this.sum);
	}
}

		








class th4_box3 extends Thread{
	
	List<Integer> all= null;
	
	public th4_box3(List<Integer>all) {
		this.all = all;
	}
	
	@Override
	public void run() {
		
		
for(Integer  f : this.all ) {
			
			if( f%2 == 0 ) {
				
				this.sum = this.sum + f ;
				
			}
			
			
		}
		System.out.println("최종 짝수값의 합계 : " + this.sum);		
	}
}






