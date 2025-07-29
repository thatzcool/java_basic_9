package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop2_9050_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalValue = 0;
        int naturalNumber = scanner.nextInt();
        IntStream intStream = IntStream.rangeClosed(1, naturalNumber);
        totalValue = intStream.sum();
        System.out.println(totalValue);
    }
}
