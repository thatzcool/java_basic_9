package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop2_543_self3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        IntStream intStream = IntStream.rangeClosed(1,input);
        intStream.filter(n -> n%2 == 0)
                .forEach(e -> System.out.print(e + " "));
    }
}
