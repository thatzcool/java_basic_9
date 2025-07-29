package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_121_FE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 0) System.out.println("zero");
        else if (input > 0) System.out.println("plus");
        else System.out.println("minus");

    }
}
