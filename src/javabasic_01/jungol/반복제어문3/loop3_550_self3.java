package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_550_self3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <=n ; i++){
            for(int j = n; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <=n ; i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
