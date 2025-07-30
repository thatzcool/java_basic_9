package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_553_self6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char start = 65;

        for(int i=1; i <= n; i++){
            for(int j = n-i+1; j >=1; j--){
                System.out.print((char)start);
                start++;
            }
            System.out.println();
        }
    }
}
