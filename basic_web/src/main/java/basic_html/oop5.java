package basic_html;
//클래스와 메소드 응용편






public class oop5 {
	
	//static : 메모리에 고정적 할당


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oop5_box ob = new oop5_box();
		ob.aaa();
		
		// 메인 클래스에서 일반 매소드를 호출할 경우
		//oop5 op = new oop5();
		//op.main2();
		
		//main2(); 					//static 메소드를 활용할 경우
	}
	
	//메인 class에 일반 메소드를 활용한 상황
	
	public static void main2() {
		System.out.println("메인 일반 메소드 호출!!");
		
		
	}

}

/*
 * 산술연산을 할 경우 결과값이 - 형태가 출력 될 경우 자료형 범위를 오버하여 결과가 나왔으므로 오류결과가 출력된 것임
 * 
 * 
class oop5_box{
	int a = 100000;
	int b = 80000;
	float c = 3.5f;
	
	public void aaa() {
		int sum = this.a * this.b;
		System.out.println(sum);
	
		
	}
}

*/


class oop5_box{
	//long sum = this.a * this.b;
	// long : 클래스를 이용하여 int를 자료형을 변환하여 결과값을 출력하는 형태
	
	
	long sum = Long.valueOf(a) * Long.valueOf(b);
	double sum2 = sum * c ;
	
	System.out.println(sum2);
	
	
}














