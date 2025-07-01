package basic_html;
//Scanner을 이용하여 배열에 있는 데이터를 검색하는 방식


import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;




public class arr_etc2 {

	public static void main(String[] args) {
		//indexOf 란 전체 단어 중 문자열에서 몇 번째에 ㅎ ㅐ당 다어가 위치해 있는지를 확ㅇ인하는 메소드
		//-1 : 해당 문자열에 찾고자 하는 단어가 없을경우 그 오에 숫자는 해당 단어가 확연이 된 사항 0 
		
		String word = "삼성 엘지 휘센";
		System.out.println(word.indexOf("위니아"));			//문자열.indexOf("찾고자하는 단어");
		
		
		
		
		
		
		
		ArrayList<String> pd = new ArrayList<String>();
		
		pd.add("LG 냉장고 3단");
		pd.add("삼성 냉장고 2단 + 김치통");
		pd.add("엘지 훼센 오브제컬렉션 에어컨");
		pd.add("캐리어 2in1 에어컨");
		pd.add("위니아 공기 청정기");
		System.out.println(pd);
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 검색 단어를 입력하세요 : ");
		String search = sc.nextLine();							//사용자가 입력한 단어
		
		int count = 0; //카운팅
		
		
		
		int w = 0;
		while(w<pd.size()) {
			
			if(pd.get(w).indexOf(search) != -1) {					//해당 단어 포함되었을 경우
				System.out.println(pd.get(w));
				count++;
				
			}
			w++;
			
		}
		
		//카운팅 변수값을 이용하여 검색된 단어가 없을 경우 해당 조건문이 발동하여 메세지를 출력함
			
			if(count == 0 ) {
				System.out.println("해당 단어의 상품을 확인 되지 않습니다.");
			}
			sc.close();
			
			
	}
							
}
