package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_144_FE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j = 1 ;j<=2*(n-i) ;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2*i)-1 ;k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
