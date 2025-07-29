package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_554_self7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;
        char alphabet = 65;

        for(int i =1; i <= n; i++){
            for(int j = n; j>=i;j--){
                System.out.print(number + " ");
                ++number;
            }
            for(int k = 1; k<=i; k++){
                System.out.print((char)alphabet + " ");
                ++alphabet;
            }
            System.out.println();
        }
    }

}
