package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_9061_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( (number++) + " ");
            }
            System.out.println();
        }
    }

}
