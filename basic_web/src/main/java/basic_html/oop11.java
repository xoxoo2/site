package basic_html;

//반복문 (for, while, do~while)


public class oop11 {

	public static void main(String[] args) {
		oop11_box ob = new oop11_box();
		ob.box1();
		
		
		// TODO Auto-generated method stub

		
		
	}

}



class oop11_box{
	int f;				//반복문에서 사용하는 변수
						// ++ 1씩 증가 , -- : 1씩 감소
	
	
	
	
	
	
	public void box1() {
		int sum = 0;
		int numger = 0;  // ->?
		
		Integer number = null ;					//<= int number;  에러남
		
		
		
		
		for (this.f=1; this.f<5; this.f++) {			
			number = 100;
			
			
			//int number = 100;  -> for문 안에있는 지역변수, for문 안에서만 작동
			
			/*  System.out.println(this.f);
			sum = sum + this.f;		
				*/
			
			sum += this.f;
			
			
		}
		System.out.println(sum);
		System.out.println(number);			// 선언 변수가 for문 안에서만 작동
	}





	public void box2() {
		for(this.f=20; this.f>5; this.f--) {
			
			if(this.f < 10 ) {
				break;
				
				//System.out.println(f);	
				
				
			}
			
			
		}
	
	
	
}

	
	
	
	public void box3() {
		for(this.f=1;; this.f++) {  //1부터 무한루프
			if(this.f>=50) {
				break;
				
			}
		}
	}
	
	
	
	
	//응용편 ( 무한루프 + 조건문)
	public void box4() {
		for(this.f=1;; this.f++) {
			if(this.f>=80) {
				break;
			}
			else {
				if(this.f%2==0)
					
					//c++;
					//c += 1;

			c = c+1
			}
		}
		System.out.println();
	}
	
}
	
	
	public void box5() {			//반복문 : break, continue
		for (this.f =1; this.f <= 10; this.f++) {
			if(this.f == 4 || this.f == 8 || this.f == 9) {
				
				continue;		//반복문은 실행시 해당 조건에 맞을 경우 건너뛰기로 진행
				
				
			}
			System.out.println(this.f);
		}
		
	}
