package javabasic_01.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_Ex02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);   //입력기능

        int input1 = in.nextInt();
        int input2 = in.nextInt();

        if(input1 > input2){
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.",input1,input2);
        }
        if(input1 < input2){
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.",input2,input1);
        }


    }




}
