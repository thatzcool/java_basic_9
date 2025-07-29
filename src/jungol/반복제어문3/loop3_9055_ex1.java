package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_9055_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= 1000) {
            sum += i;
            if (sum > 1000) break;
            ++i;
        }
        System.out.printf("%1$d %2$d", i, sum);

    }
}
