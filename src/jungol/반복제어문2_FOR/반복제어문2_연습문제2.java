package jungol.반복제어문2_FOR;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {

        for(int i = 65 ; i <= 90 ; i++){
            System.out.printf("%C",i);

        }
        System.out.println();
        System.out.println("======================");

        IntStream intStream = IntStream.rangeClosed(65,90);
        intStream.forEach(e-> System.out.print((char)e));


    }


}
