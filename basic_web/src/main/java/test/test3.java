package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		   Scanner scr = new Scanner(System.in);

	       
	        System.out.print("과일 이름을 입력하세요");
	        String f = scr.nextLine();

	     
	        if (f.equals("watermelon")) {
	            System.out.println("watermelon : 수박");
	        } else if (f.equals("kiwi")) {
	            System.out.println("kiwi : 키위");
	        } else if (f.equals("grape")) {
	            System.out.println("grape : 포도");
	        } else if (f.equals("strawberry")) {
	            System.out.println("strawberry : 딸기");
	        } else {
	            System.out.println("해당 과일의 한글 이름을 찾을 수 없습니다.");
	        }

	        scr.close();
	    
	

	}

}
