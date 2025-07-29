package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_149_FE10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                int number = (int)(Math.random()*10)+1;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
