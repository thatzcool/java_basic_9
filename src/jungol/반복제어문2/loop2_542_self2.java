package jungol.반복제어문2;

import java.util.stream.IntStream;
public class loop2_542_self2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(10, 20);
        intStream.forEach(e -> System.out.print(e + " "));
    }
}
