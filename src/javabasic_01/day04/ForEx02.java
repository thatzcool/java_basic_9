package javabasic_01.day04;

public class ForEx02 {

    public static void main(String[] args) {
        // 1~ 10까지의 합     출력: 55  작성하세요
        int result = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

        System.out.println("나열식 합 : " + result);
        System.out.println("==================");
        // result = 0;
        for(int i = 1 ; i <= 10; i++) {
           int result1 = 0;
           result1 += i ;
            System.out.println("for문을 이용한 합 :" + result1);
        }

        System.out.println("for문을 이용한 합 :" + result);

    }
}
