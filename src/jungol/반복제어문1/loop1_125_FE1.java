package jungol.반복제어문1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop1_125_FE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        IntStream intStream = IntStream.rangeClosed(1, input); //range 와 rangeClosed 구별하기
        intStream.forEach(e -> System.out.print(e + " "));
    }
}
