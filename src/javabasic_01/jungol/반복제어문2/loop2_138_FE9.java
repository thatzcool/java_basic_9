package javabasic_01.jungol.반복제어문2;

import java.util.Scanner;

public class loop2_138_FE9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        for(int i = 1; i <= integer; i++){
            for(int j = 1; j <= integer; j++){
                System.out.printf("(%1$d, %2$d) ",i,j);
            }
            System.out.println();
        }
    }
}
