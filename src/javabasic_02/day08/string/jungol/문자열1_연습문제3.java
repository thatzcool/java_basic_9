package javabasic_02.day08.string.jungol;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String inputString = "jungol olympiad";

        for (int i = 0; i < 5; i++) {
            int targetNum = in.nextInt();
            if (targetNum > 14 || targetNum < 0) {
                break;
            }
            System.out.print(inputString.charAt(targetNum));
        }
    }

}

