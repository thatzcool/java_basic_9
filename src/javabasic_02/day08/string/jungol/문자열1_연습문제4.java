package javabasic_02.day08.string.jungol;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
      String str = in.nextLine();
      int lenOfStr = str.length();

        System.out.println("입력받은 문자열의 길이는 "+ lenOfStr + "입니다.");
        for (int i = lenOfStr-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }

}

