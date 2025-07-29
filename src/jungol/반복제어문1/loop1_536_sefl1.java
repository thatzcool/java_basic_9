package jungol.반복제어문1;

import java.util.stream.IntStream;

public class loop1_536_sefl1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 15);
        intStream.forEach(e -> System.out.print(e + " "));
    }
}
