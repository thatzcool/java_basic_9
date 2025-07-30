package javabasic_02.day06.jungol;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class 배열1_연습문제8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
         Integer[] inputArray = new Integer[10];

         int total = 0;
        for (int i = 0; i < inputArray.length; i++) {
          total = in.nextInt();
        }
        System.out.printf("총점 = %d\n",total);
        System.out.printf("평균 = %.1f\n",(double)total/10);

    }
}
