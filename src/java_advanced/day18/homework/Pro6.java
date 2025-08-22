package java_advanced.day18.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Member{
    private String name;
    private int age;
}



public class Pro6 {
    public static void main(String[] args) {
      List<Member> list = Arrays.asList(
              new Member("홍길동",30),
              new Member("홍길동",40),
              new Member("김자바",26)
      );

      double avg = list.stream()
              .mapToInt(Member::getAge).average().getAsDouble();

        System.out.printf("평균나이: %.1f",avg);

    }
}
