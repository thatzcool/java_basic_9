package javabasic_02.day06.jungol;

import java.time.LocalDate;
import java.util.Scanner;

public class 배열1_연습문제5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){

            System.out.printf("YEAR = ");
            int year = in.nextInt();
            System.out.printf("MONTH = ");
            int month = in.nextInt();

            if(month  == 0 ) break;

            if(month>12) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            LocalDate localDate = LocalDate.of(year,month, 1);
            System.out.printf("입력하신 달의 날의 수는 %d일입니다.\n", localDate.lengthOfMonth());


        }
    }

}
