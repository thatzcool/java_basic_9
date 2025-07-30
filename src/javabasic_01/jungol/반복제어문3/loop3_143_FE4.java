package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_143_FE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1; i<=n; i++){
            for(int k=1; k <i; k++){
                System.out.print(" ");
            }
            for(int j=1; j <=(2*(n-i))+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i<n; i++) {
            for(int k=(n-1)-i; k > 0; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
}
