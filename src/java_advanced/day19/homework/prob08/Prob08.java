package java_advanced.day19.homework.prob08;
// 각 직원의 이름, 부서 및 급여를 가직 직원리스트입니다. 각 부서의 평균 급여를 계산하여 출력하세요

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Employee {
    private String name;
    private String department;
    private double salary;
}

public class Prob08 {

    public static void main(String[] args) {
        List<Employee> numbers = Arrays.asList(
                new Employee("John","HR",5000),
                new Employee("Jane","HR",5000),
                new Employee("Steve","Engineering",8000),
                new Employee("Kelly","Engineering",7000),
                new Employee("Jim","Sales",8500)

        );
    }
}
