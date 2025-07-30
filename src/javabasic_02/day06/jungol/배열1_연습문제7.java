package javabasic_02.day06.jungol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class 배열1_연습문제7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // 4자리 이하의 10개의 정수 저장   = > 배열
        Integer[] outputArray = new Integer[10];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = in.nextInt();
        }


        //입력받은 수를 검사해서 짝수인지 홀수 인지를 판단하여 따로 따로 저장관리하자
        Arrays.sort(outputArray);

        int maxIndex = 9;
        int minIndex = 0;

        int maxEven = outputArray[maxIndex];
        int minOdd = outputArray[minIndex];
//각 짝수 홀수 저장값중 가장 작은 값을 출력
        while (abs(maxEven) % 2 != 0) {
            maxIndex--;
            maxEven = outputArray[maxIndex];
        }

        while (abs(maxEven) % 2 != 1) {
            minIndex++;
            minOdd = outputArray[minIndex];
        }

        System.out.printf("%d %d ", minOdd, maxEven);

    }
}
