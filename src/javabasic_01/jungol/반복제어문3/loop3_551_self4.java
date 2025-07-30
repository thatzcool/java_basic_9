package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_551_self4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =0; i<n; i++){
            for(int k=0;k < i ;k++) {
                System.out.print(" ");
            }

            for(int j = n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

