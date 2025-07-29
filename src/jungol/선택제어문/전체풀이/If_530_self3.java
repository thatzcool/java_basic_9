package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_530_self3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = scanner.nextInt();
        if (old >= 20) System.out.println("adult");
        else System.out.printf("%d years later", (20 - old));
    }
}
