package jungol.반복제어문1;

import java.util.Scanner;

public class loop1_538_self3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        boolean flag = true;
        while(flag){
            System.out.print("number? ");
            input = scanner.nextInt();
            if(input > 0) System.out.println("Positive integer");
            if(input < 0) System.out.println("Negative integer");
            if(input == 0) break;
        }
    }
}
