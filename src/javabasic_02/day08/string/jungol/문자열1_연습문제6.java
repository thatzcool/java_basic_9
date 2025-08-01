package javabasic_02.day08.string.jungol;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class 문자열1_연습문제6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String str = in.nextLine();
            char ch = str.charAt(0);

//            if ((int) ch >= 123 || (int) ch <= 47) {
//                System.out.println("영문, 숫자 이외의 문자입니다.");
//                break;
//            }
//
//            if (isDigit(ch)) {
//                System.out.println("숫자문자입니다.");
//            } else {
//                System.out.println(isUpperCase(ch) ? "대문자입니다." : "소문자입니다.");
//         }

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("소문자입니다.");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("대문자입니다.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }


        }


    }

}

