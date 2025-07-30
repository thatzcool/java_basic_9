package javabasic_01.jungol.반복제어문1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop1_537_self2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveInt = scanner.nextInt();
        int totalValue = 0;

        IntStream intStream = IntStream.rangeClosed(1,positiveInt);
        totalValue = intStream.sum();

        System.out.println(totalValue);
    }
}
