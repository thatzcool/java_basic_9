package day05.forEX;

import java.util.Scanner;

public class StartEx05 {

    public static void main(String[] args) {
        int row, col;    //행, 열 값을 저장할 변수 선언

        Scanner in = new Scanner(System.in);
        System.out.println("몇행으로 피라미드를 만들까요?");
        int n = in.nextInt();

        for (row = 1; row <= n; row++) {           //사용자 입력값이 row(행) 결정

            for (col = row; col < (n - 1); col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= (2* row - 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
