package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_535_self8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        String grade ="";

        switch((int)score) {
            case 4 -> {grade = "scholarship";}
            case 3 -> {grade="next semester";}
            case 2-> {grade = "seasonal semester";}
            case 0,1 -> {grade = "retake";}
        }

        System.out.println(grade);
    }
}
