package test;

public class test5 {

	public static void main(String[] args) {
		
		 int[] n = {20, 36, 11, 8, 22, 31};
	        
	        int num = n[0];

	        
	        for (int i = 1; i < n.length; i++) {
	            if (n[i] > num) {
	                num = n[i];
	            }
	        }

	        
	        System.out.println("가장 큰 수는 " + num + " 입니다.");
	   

	}

}
