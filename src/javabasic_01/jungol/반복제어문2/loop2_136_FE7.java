package javabasic_01.jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class loop2_136_FE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();

        IntStream intStream = IntStream.rangeClosed(1,10);
        intStream.forEach(e -> System.out.print((e*5) + " " ));
    }
}
