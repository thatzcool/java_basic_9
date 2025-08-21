package java_advanced.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(strings);
       // stream.forEach(System.out::println);
        stream.forEach(item -> System.out.print(item + " "));

        Integer[] integers = new Integer[] {1, 2, 3, 4, 5};
        Stream<Integer> intStream = Arrays.stream(integers);
        intStream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Long[] longs = new Long[] {(long)1, (long)2, (long)3, (long)4, (long)5};
        Stream<Long> longStream = Arrays.stream(longs);
        longStream.forEach(item -> System.out.print(item + " "));
        System.out.println();

        Double[] doubles = new Double[] {(double)1, (double)2, (double)3, (double)4, (double)5};
        Stream<Double> doubleStream = Arrays.stream(doubles);
        doubleStream.forEach(item -> System.out.print(item + " "));

    }
}
