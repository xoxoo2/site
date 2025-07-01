package basic_html;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Scanner;
import java.util.Scanner;

// import java.util.*;

/* 2차 클래스 및 2차 원시 배열 모두 정렬을 사용시 1차 그룹을 먼저 정렬한 후에 2차에 반영 되도록하는 원칙 입니다. */

public class arr_etc {



	public static void main (String[] args) {
		
		Integer number[][] = {								//원시배열
				{22,1,6,4,20},
				{3,9,7,33,11}
		};
		
		
		//2차 클래스 배열
		ArrayList<ArrayList<Integer>> data2 = new ArrayList<ArrayList<Integer>>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬방식 : 1오름차순, 2.내림차순 : ");
		
		
		int select = sc.nextInt();

		
		//반복문으로 원시배열 그룹단우 별로 1차 클래스 배열로 변환 => 2차 클래스에 적용
		int w = 0;
		while(w<number.length) {
			ArrayList<Integer> data1 = new ArrayList<Integer>(Arrays.asList(number[w]));
			
			if(select == 1) {
				Collections.sort(data1);
			}
			else if(select == 2) {
				Collections.sort(data1, Collections.reverseOrder());	
			}
			
			
			
			
			Collections.sort(data1); 			//1차 클래스 배열을 오름차순 적용
			
			Collections.sort(data1, Collections.reverseOrder());		//내림차순 적용
			data2.add(data1);										//2차 클래스 배열로 적용
			w++;
			
			
			
		}
		System.out.println(data2);
		Collections.sort(data2.get(0));
		System.out.println(data2);
		
	}

	
}