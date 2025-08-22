package java_advanced.day19.filterEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEx01 {

    public static void main(String[] args) {
        //List 컬렉션 ArrayList 생성
        //list에 5명의 이름을 저장하세요 단 5명의 이름중 같은 이름을 두번 넣어주세요
        List<String> list = new ArrayList<>();
        list.add("신세계");
        list.add("신세계");
        list.add("Java");
        list.add("김민성");
        list.add("김민서");

        List<String> list1 = Arrays.asList(
                new String("신명성"),
                new String("신명성"),
                new String("김주림")
        );

        //중복요소 제거
        list.stream().forEach(System.out::println);

        System.out.println();

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // list1에서 중복을 제거하고 이름에 "신"  들어간 사람의 이름을 출력하세요
        //list1에 들어있는 모든 요소를 출력 필터링 안함
        list1.stream().forEach(System.out::println);

        System.out.println();
        //같은 이름 제거 필터링
        list1.stream().distinct().forEach(System.out::println);

        //같은 이름 제거 필터링을 하고 이름에 "신"씨만 출력하세요

        list1.stream().distinct().filter(name -> name.startsWith("신")).forEach(name -> System.out.println());


    }
}
