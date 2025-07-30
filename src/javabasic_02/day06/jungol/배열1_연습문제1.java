package javabasic_02.day06.jungol;

import java.util.Scanner;

public class 배열1_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//       int n1,n2,n3,n4,n5;
//       n1 = in.nextInt();
//       n2 = in.nextInt();
//       n3 = in.nextInt();
//       n4 = in.nextInt();
//       n5 = in.nextInt();

        int[] array = new int[5];
//  수동 입력 데이터 할당
//        array[0] = in.nextInt();
//        array[1] = in.nextInt();
//        array[2] = in.nextInt();
//        array[3] = in.nextInt();
//        array[4] = in.nextInt();

        System.out.println("====itar 방식 입력====");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("====iter 방식 출력====");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("====itar 방식 출력====");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
