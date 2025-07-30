package javabasic_01.jungol.반복제어문2;

import java.util.stream.IntStream;

public class loop2_9047_ex2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(65, 90);
        intStream.forEach(e -> System.out.print((char)e));
    }
}
