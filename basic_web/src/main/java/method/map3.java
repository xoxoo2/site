package method;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





/*

응용문제
{"hong","kim","park","jang"}
{"m","W","w","m"}

해당 원시 배열이 있습니다.
해당 원시배열을 이용하여 다음 결과처럼출력되는 key배열 코드를 작성하시오.

{ userid = [hong,kim,park,jang], gender=[m,w,m,w] }

*/



class map3_test{
	
	String data[][] = {
			{"hong","kim","park","jang"},
			{"m","W","w","m"}
	};
	
	String keydata[] = {"userid","gender"};						//키 셋팅
	public void keyarray() {
		
		Map<String, List<String>> userdata = new HashMap<String, String>();
		
		
		
		int w=0;
		do {
			
															//interface로 클래스 배열에 값을 이관하는 코드
			
			List<String> db = new ArrayList<String>();
			for(int f=0; f<this.data[0].length; f++) {					//4
				db.add(this.data[w][f]);
			}
			
			userdata.put(this.keydata[w], db);							
			w++;
		}while (w<this.keydata.length);							//2
	
		System.out.println();
	}
	
	
}
