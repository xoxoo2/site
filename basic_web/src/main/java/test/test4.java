package test;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
        int[] n = new int[10];

        
        System.out.println("1부터 500까지의 숫자 중 10개를 입력하세요");
        for (int i = 1; i < 10; i++) {
            while (true) {
                System.out.print("");
                int num = scr.nextInt();
                if (num >= 1 && num <= 500) {
                    n[i] = num;
                    break;
                } else {
                    System.out.println("1부터 500까지의 숫자만 입력 가능합니다.");
                }
            }
        }

        
        Arrays.sort(n);
        int[] reversedNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            reversedNumbers[i] = n[9 - i];
        }

       
        System.out.println("최종출력: " + Arrays.toString(reversedNumbers));

        scr.close();


	}

}
