package jungol.연산자;

import java.util.Scanner;

public class Operator_9024_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print((a>b)? 1 + " " : 0+ " ");
        System.out.print((b>=c)? 1 + " " : 0+ " ");
        System.out.print((a<=b)? 1 + " " : 0+ " ");
        System.out.print((b<c)? 1 + " " : 0+ " ") ;
    }
}
