package java_advanced.day19.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
class Student{
    private String name;
    private int score;
}

public class MappingEx01 {

    public static void main(String[] args) {
           //학생 3명을 리스트컬렉션을 생성하여 순서대로 저장하세요
        List<Student>  students = new ArrayList<>();
        students.add(new Student("신세계",100));
        students.add(new Student("김동민",100));
        students.add(new Student("이진주",100));

           //학생들의 점수(score)를 stream()방법으로 출력하세요
           students.stream().mapToInt(student -> student.getScore()).forEach(System.out::println);

           //학생들의 총점을 출력하세요
              int sum = students.stream().mapToInt(student -> student.getScore()).sum();
              System.out.println(sum);

           //학생들의 점수의 평균을 출력하세요 (평균은 예)  80.1
             double avg = students.stream()
                          .mapToInt(student -> student.getScore()).average().getAsDouble();

             System.out.printf("%.1f",avg);


    }
}
