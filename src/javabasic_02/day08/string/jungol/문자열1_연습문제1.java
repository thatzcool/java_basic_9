package javabasic_02.day08.string.jungol;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            String inputStr = in.next();
            char ch = inputStr.charAt(0);
            System.out.println(ch + " -> " +(int)ch);

            if(ch == '0') break;
        }

    }
}
