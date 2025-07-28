package jungol.반복제어문2_FOR;

import java.util.stream.IntStream;

public class 반복제어문2_연습문제3 {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 20 ; i++){
            if(i%2 ==0) System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("======================");

        IntStream intStream = IntStream.rangeClosed(1,20);
        intStream.filter(n -> n%2 == 1).forEach(e-> System.out.print(e + " "));



    }


}
