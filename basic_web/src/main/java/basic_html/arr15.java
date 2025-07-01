package basic_html;

import java.util.ArrayList;
//import java.util.Arrays;



/*상품출력 파트    java코드 : 원시배열 => Controller에서 DTO 원시배열 전달 DTO => 
  클래스 배열로 변환 => Controller 출력*/
 

public class arr15 {

	public static void main(String[] args) {
		Controller_arr15 ca = new Controller_arr15();
		ca.product_list();
		

	}

}

/* 응용문제 : 해당 프로세서에 검색 단어를 이벽하면 해당 상품 정보가 출력 되도록 코드를 수정하시오 */





class Controller_arr15{
														//해당 외부 클래스를 인스턴스를 객체화 하여 필드에 적용시킴
	
	datalist dl = new datalist();
			
	
												//DTO를 로드
	product_DTO dto = null;
	

	
	//상품 데이터
	ArrayList<ArrayList<String>> pdlist = null;
	Scanner sc = null;
	
	
	public void product_list() {
		String result[][] = this.dl.product();
		this.dto = new product_DTO(result);
		
		
		/*this.dto.product_DTO()
		//System.out.println(Arrays.deepToString(result));

		//dto에서 2차 클래스배열 return값을 받아서 Controller에서 객체처리 및 출력
		
		
		ArrayList<ArrayList<String>> pdlist = this.dto.alldata();
		System.out.println(this.pdlist);
		System.out.println(this.pdlist.get(0));			*/
		
		this.pdlist = this.dto.alldata();
		
		
		
		this.sc = new Scanner(System.in);
		
		
		System.out.println("상품명 검색어를 입력하세요");
		String search = this.sc.nextLine();
		int w = 0;
		
		do {
			if(this.pdlist.get(w).get(0).indexOf(search)!= -1) {
				
				System.out.println(this.pdlist.get(w));			//검색어
				count++;
				
			}
			
			w++;
		}while (w<this.pdlist.size());
		//전체 데이터 중 검색된 상품이 없을 경우
		
		
		if(count==0) {
			System.out.println("해당 검색어");
			
		}
		this.count.close();
		
	}
}

