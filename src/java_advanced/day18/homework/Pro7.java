package java_advanced.day18.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
class Member1 {
    private String name;
    private String job;
}

public class Pro7 {
    public static void main(String[] args) {
        List<Member1> list = Arrays.asList(
                new Member1("홍길동", "개발자"),
                new Member1("홍길동", "디자이너"),
                new Member1("김자바", "개발자")
        );

        List<Member1> developers = list.stream()
                .filter(member -> member.getJob().equals("개발자")).collect(Collectors.toList());

        System.out.println(developers);
        //developers.forEach(System.out::println);
        developers.stream().forEach(member1 -> System.out.println(member1));



    }
}