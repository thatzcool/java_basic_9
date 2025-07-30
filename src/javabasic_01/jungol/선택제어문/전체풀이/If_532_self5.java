package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_532_self5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        char grade ;

        if((number1>=4.0)&&(number2>=4.0)) grade = 'A';
        else if((number1>=3.0)&&(number2>=3.0)) grade = 'B';
        else grade = 'C';

        System.out.println(grade);
    }
}
