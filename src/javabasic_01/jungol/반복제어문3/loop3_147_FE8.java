package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_147_FE8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;

        for(int i=1; i<=n ; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= n-(i-1); k++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }

}
