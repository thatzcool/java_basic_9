package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop2_132_FE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        IntStream intStream = IntStream.rangeClosed(1, input);
        int totalValue = intStream.filter(n -> n % 5 == 0)
                .sum();
        System.out.println(totalValue);
    }
}