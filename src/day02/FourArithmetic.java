package day02;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 :");
        a = sc.nextInt();

        System.out.print("두번째 정수 입력 :");
        b = sc.nextInt();


        System.out.printf("a+b=%d\n", a, b, a + b);
        System.out.printf("a-b=%d\n", a, b, a - b);
        System.out.printf("a*b=%d\n", a, b, a * b);
        System.out.printf("a/b=%d\n", a, b, a / b);


        int kor, eng , total ;
        double avg;

        kor = 77;
        eng = 87;
        total = kor + eng;
        avg = total/2;


        System.out.printf("총점:%d\n평균:%f",total,avg);
        System.out.printf("총점:%d\n평균:%.1f",total,avg); //소수둘째자리에서 반올림하여 소수 첫번째 자리까지 출력



    }
}
