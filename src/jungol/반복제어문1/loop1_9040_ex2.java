package jungol.반복제어문1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop1_9040_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        IntStream intStream = IntStream.rangeClosed(1, num);
        int totalValue = intStream.sum();
        int afterNum = num+1;

        System.out.printf("1부터 %1$d까지의 합 = %2$d\n",num, totalValue);
        System.out.printf("while문이 끝난 후의 num의 값 = %d", afterNum);
    }

}
