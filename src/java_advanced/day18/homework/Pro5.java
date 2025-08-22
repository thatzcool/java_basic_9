package java_advanced.day18.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream().filter(
                str -> str.toLowerCase().contains("java"))
                .forEach(System.out::println);

    }


}
