package jungol.반복제어문2;

import java.util.stream.IntStream;

public class loop2_9048_ex3_1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 20);
        intStream.filter(n -> n%2 == 1)
                .forEach(e -> System.out.print(e + " "));
    }
}
