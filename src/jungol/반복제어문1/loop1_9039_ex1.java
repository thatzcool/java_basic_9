package jungol.반복제어문1;

import java.util.stream.IntStream;

public class loop1_9039_ex1 {
    public static void main(String[] args) {
        char alphabet = 65;
        IntStream intStream = IntStream.rangeClosed(65, 90);
        intStream.forEach(e -> System.out.print((char)e));
    }
}
