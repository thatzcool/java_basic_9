package javabasic_02.day06.jungol;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class 배열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //1. 정수 10개를 입력받아라 (같은 타입의 값의 저장=> 배열에 반복문을 통해서 처리하자)
        int[] outputArray = new int[10];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = in.nextInt();

        }
        //2. 출력조건이 정수형 배열에서 세번째(index 2), 다섯번째(index 4 , 마지막 값(index 9)을 차례로 출력
        for (int i = 0; i < outputArray.length; i++) {

            if (i == 2 || i == 4 || i == 9) {
                System.out.printf("%d ", outputArray[i]);
            }

        }

        System.out.print(outputArray[2] + " " + outputArray[4] + " " + outputArray[9]);


    }


}
