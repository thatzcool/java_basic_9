package javabasic_01.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_Ex07 {

    public static void main(String[] args) {


        System.out.println("세 수를 입력하세요 ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요 ");
        number = in.nextInt();

        if(number == 1) System.out.println("삽입을 선택하셨습니다.");
        else if(number == 2) System.out.println("수정을 선택하셨습니다.");
        else if(number == 3) System.out.println("삭제를 선택하셨습니다.");
        else System.out.println("1,2,3 중의 숫자를 입력해주세요");

    }


}
