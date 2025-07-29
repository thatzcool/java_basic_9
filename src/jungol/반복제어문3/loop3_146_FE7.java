package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_146_FE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char alphabet = 65;
        int number = 0;

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n-i+1;j++){
                System.out.print((char)alphabet + " ");
                alphabet++;
            }
            for(int k = 1 ; k <= i-1 ; k++){
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}
