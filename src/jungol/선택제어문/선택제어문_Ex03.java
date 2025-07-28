package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_Ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);   //입력기능

        System.out.print("점수를 입력하세요. ");
        int score = in.nextInt();


        if(score >=80 ){
            System.out.printf("축하합니다. 합격입니다.");
        } else {
            System.out.printf("불합격입니다. ");
        }


    }




}
