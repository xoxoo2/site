package method;

import java.util.Arrays;

public class in2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in2_box bx = new in2_box();
		bx.money();

	}

}



class in2_box implements inter2{
	@Override
	public void money() {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(this.data));
	}
	
}


//추가로 interface를 적용한 사항을 class에 상속시켜서 작동하는 방법


// implements : 여러개의 interface를 로드 하 ㄹ 수 있음
/// e


class in2_box implements inter2{ 
	
}


class ab


