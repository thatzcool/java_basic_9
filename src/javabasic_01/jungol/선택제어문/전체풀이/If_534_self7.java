package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_534_self7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String capital = scanner.next();
        String grade="";

        if(capital.equals("A")) grade = "Excellent";
        else if(capital.equals("B")) grade = "Good";
        else if(capital.equals("C")) grade = "Usually";
        else if(capital.equals("D")) grade = "Effort";
        else if(capital.equals("F")) grade = "Failure";
        else grade = "error";

        System.out.println(grade);
    }
}
