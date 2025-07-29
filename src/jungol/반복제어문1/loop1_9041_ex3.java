package jungol.반복제어문1;

import java.util.Scanner;

public class loop1_9041_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        boolean flag = true;
        while(flag) {
            System.out.print("점수를 입력하세요. ");
            score = scanner.nextInt();
            if(score >= 80 && score <= 100) System.out.println("축하합니다. 합격입니다.");
            else if(score < 80 && score >=0) System.out.println("죄송합니다. 불합격입니다.");
            else break;
        }
    }
}
