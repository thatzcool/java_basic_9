package javabasic_02.day08.string.jungol;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String tmpStr = in.nextLine();
        int lenOfStr = tmpStr.length();

        for (int i = 0; i < lenOfStr; i++) {
            System.out.print(isUpperCase(tmpStr.charAt(i)) ? toLowerCase(tmpStr.charAt(i)) : toUpperCase(tmpStr.charAt(i)));
        }


    }

}

