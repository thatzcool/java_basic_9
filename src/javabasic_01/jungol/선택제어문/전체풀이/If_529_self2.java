package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_529_self2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int weight = scanner.nextInt();
        int obesity = weight + 100 - height;
        System.out.println(obesity);
        if (obesity > 0) System.out.println("Obesity");

    }
}
