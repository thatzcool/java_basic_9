package javabasic_01.jungol.반복제어문3;

import java.util.Scanner;

public class loop3_549_self1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        int i = 1;
        while(i <= n){
            if((i%2)==1) {
                sum += i;
                ++count;
            }
            if(sum >= n) break;
            ++i;
        }
        System.out.printf("%1$d %2$d",count, sum);
    }
}
