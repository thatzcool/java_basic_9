package jungol.연산자;

import java.util.Scanner;

public class Operator_9023_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print((a==b)? 1 + " " : 0 + " ");
        System.out.print((b==c)? 1 + " " : 0 + " ");
        System.out.print((a!=b)? 1 + " " : 0 + " ");
        System.out.print((b!=c)? 1 + " " : 0 + " ");
    }
}


