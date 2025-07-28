package jungol.연산자;

import java.util.Scanner;

public class Operator_9022_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (++a) + (b--);

        System.out.printf("a = %1$d, b = %2$d, c = %3$d", a, b, c);
    }
}
