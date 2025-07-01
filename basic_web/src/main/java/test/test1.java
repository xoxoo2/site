package test;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("1부터 30까지의 숫자중 하나를 입력하시오. ");
		
        Random n = new Random();
       

        int i = 0;
       

        
        
        if (s.hasNextInt()) {
            i = s.nextInt();
            if (i < 1 || i > 30) {
                System.out.println("1부터 30까지의 숫자를 입력하세요.");
                return;
            }
        } else {
            System.out.println("숫자를 입력하세요.");
            
        }return ;
        
        
	}       
}   
        
        
        
        
        
        
 /*       while (true) {
            System.out.print("1부터 30까지의 숫자 중 하나를 입력하세요. ");
            
            if (scr.hasNextInt()) {
                i = scr.nextInt();
                if (i >= 1 && i <= 30) {
                    break; 
                } else {
                    System.out.println("1부터 30까지의 숫자를 입력하세요.");
                }
            } else {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
               
            }
        } 
        
        
	}       
        
        
        
*/        
   
	
	
	
        
        
        
        
        
  /*      System.out.print("숫자를 입력하세요 ");
        int count = scr.nextInt();

        
        System.out.print("");
        for (int i = 0; i < count; i++) {
            int randomNumber =	 "";
            System.out.print(randomNumber);
            if (i < count - 1) {
                System.out.print(", ");
            }
            else if(i>30 || count==0){
            	System.out.println("1~30까지의 숫자를 입력하세요");
            }
        }
        
        
        System.out.println(); 
    }

}


*/
