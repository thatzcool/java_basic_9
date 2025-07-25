package jungol;

import java.util.Scanner;

public class 반복제어문1_자가진단1 {

    public static void main(String[] args) {
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.print(1 );
        System.out.print(2 );
        System.out.print(3 );
        System.out.print(4 );
        System.out.println();
        for(int loop = 1 ; loop <= 50 ; loop++ ){

            System.out.printf("%d ",loop);
        }

        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);

        for(int i = 1; i<=20 ; i++){
            System.out.printf("%c",c);
            //String 클래스 API 참고하여 문자로 받는 방법을 찾아서 입력문자 하나를 출력
        }

    }
}
