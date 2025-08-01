package javabasic_02.day08.string.jungol;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       String inputString = in.nextLine();
       String[] splitArray = inputString.split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            String string = splitArray[i];
            System.out.println(string);

        }

    }

}

