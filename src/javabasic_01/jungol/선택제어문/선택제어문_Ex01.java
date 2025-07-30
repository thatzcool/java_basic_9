package javabasic_01.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_Ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);   //입력기능
        System.out.print("한 개의 정수 입력");
        int input = in.nextInt();

        System.out.println(input);
        if(input > 10) System.out.println("10보다 큰 수를 입력하셨습니다.");

    }







}
