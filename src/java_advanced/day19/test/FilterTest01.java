package java_advanced.day19.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");

        //1. 이름 중 "A"로 시작하는 이름을 수집하여 출력하세요
        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

        for (String name : filteredNames) {
            System.out.println(name);
        }

        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(name -> System.out.println());
        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);


        //2. List<String> names2 = Arrays.asList("Alice","Bobi","Charlie");

        //2. 각 이름의 길이를 세어서 출력하시요 결과 :[5, 4, 7]

        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");
         names2.stream()
                .mapToInt(String::length).forEach(System.out::println);



    }
}
