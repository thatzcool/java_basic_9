package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.InputMismatchException;
import java.util.Scanner;

public class If_531_self4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        String grade ="";
        try {
            if ((weight <= 50.80) && (weight > 0)) grade = "Flyweight";
            else if (weight <= 61.23) grade = "Lightweight";
            else if (weight <= 72.57) grade = "Middleweight";
            else if (weight <= 88.45) grade = "Cruiserweight";
            else if (weight > 88.45) grade = "Heavyweight";
            else System.out.println("0보다 큰 수를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
        System.out.println(grade);
    }
}
