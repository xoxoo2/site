package method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




class map1_box{
	
	List<String> all = null;
	Map<String,String> all2 = null;
	Map<String,Object> all3 = null;
	
	
	public void box() {
		
		HashMap<String, String> map1= new HashMap<>;
		
		map1.put("product1", "냉장고");
		map.put
		
		
		
	}
	
	
	
	
	//key 배열 + arraylist	=>  1차 순차클래스 배열 =>  2차 키배여로 전환
	
	public void box2() {
		ArrayList<Integer> one = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> data = new HashMap<String, ArrayList<Integer>>();
		
		
		one.add(10);
		one.add(500);
		one.add(150);
		
		data.put("point", one);
		System.out.println(data);
		System.out.println(data.get("point").get(1));				//해당 키에 맞는 데이터값
		System.out.println(data.get("point").size());				//해당 키에 데이터 갯수
		
		
		
		//foreach를 이용하여 대표키를 설정한 후 해당 대표키에 ㅈ거용된 데이터를 박복문으로 출력
		
		for(Integer no : data.get("point")) {		//for (출력할 자료형 변수명 : 키배열을 선언
			System.out.println(no);
		}
		
		
		data.remove("point");						//해당키에 데이터를 모두 ㅏ삭제
		
		data.get("point").remove(1);
		data.get("point").remove(1);				//해당 ㅣ 그룹에 이쓴 데이터윽정값을 삭
		
		data.get("point").get(1);
		
		
		System.out.println(ㅇㅁㅅㅁ);
		
		
	}
	
	
}