package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;
public class loop2_544_self4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int totalValue = 0;
        IntStream intStream = IntStream.rangeClosed(input,100);
        totalValue = intStream.sum();
        System.out.println(totalValue);
    }
}
