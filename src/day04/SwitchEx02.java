package day04;

import java.util.Scanner;

public class SwitchEx02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("학점을 입력하세요. A,B,C 중");
        char grade = in.next().charAt(0);

        // 사용자에게 A~C 중  한 문자를 받아서 'A' ==> "매우 우수"     B =>  "우수"   C => "노력하세요"

        switch (grade) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;

            default:
                System.out.println("성적이 잘 못 입력되었습니다.");
        }

    }
}
