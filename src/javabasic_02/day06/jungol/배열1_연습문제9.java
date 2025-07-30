package javabasic_02.day06.jungol;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class 배열1_연습문제9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] outputArray = {95, 75, 85, 100, 50};   //배열의 생성 및 초기화 한번에 처리

        Arrays.sort(outputArray);   //오름차순 정렬 처리

        for (int i : outputArray) {
            System.out.print(i +" ");
        }



    }
}
