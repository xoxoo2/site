package basic_html;

//While + do~while

public class oop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new oop12_box().box1();									//while, do~while 사용법
		new oop12_box().box2();										//무한 루프
		new oop12_box().box3();										// 무한 루프 (do~while)
	}

}


class oop12_box {
	
	int w;
	
	
	
	public void box3() {
		this.w=0;
		boolean ck = true;
		
		do {
			System.out.println(this.w);
			if(this.w > 20) {
				
				
				break;
				//ck = false;			//무한루프 정지
				
			}
			
			//System.out.println(this.w);  > NO
			
			
			this.w++;
		}while(ck);						//true를 이용하여 무한루프
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void box2()	{				//무한루프				
		this.w = 0;
		boolean ok = true;
		
		
		while(ok)	{										//true 무한 적용
			System.out.println(this.w);
			if(this.w == 20) {
				
				ok = false;									//true와 false를 이용하여 무한, 정지를 할수 있음
				//break;
				
			}
			
			this.w++;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void box1() {
		this.w = 0;											//시작값
		while(this.w <=5) {
			
			System.out.println(this.w);
			this.w++;										//증가, 감소
		}
		
		this.w =0;									//시작값
		
		do {
			System.out.println(this.w);
			this.w++;								//증가, 감소
			
		}while(this.w <= 5);						//범위값
		
		
		
	}
}