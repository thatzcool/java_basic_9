package day03;

public class PrintEx {
    public static void main(String[] args) {
//        표준 출력 장치인 모니터에 값을 출력하였다.
//        System. + out. + println(리터럴 또는 변수);
//        시스템으로 출력하는데 괄호안의 내용을 출력하고 행을 바꿔라
//  출력방법에 따라  println() , print() , printf()

        System.out.printf("과목명: %s \n","자바");
        System.out.printf("과목명: %1$s 이름: %2$s \n","자바","서유미");
        System.out.printf("과목명: %3$s 이름: %2$s 학번: %3$s\n","자바","서유미","1234");

        //정수 123을 printf() 출력하고 싶다.
        System.out.printf("%d \n",123);

        //정수 ___123을 printf() 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 공백
        System.out.printf("%6d \n",123);
        //정수 123___을 printf() 출력하고 싶다. 6자리 정수 출력. 오른쪽 빈자리 공백
        System.out.printf("%-6d \n",123);
        //정수 000123을 printf() 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 0으로 채워라
        System.out.printf("%06d \n",123);

        System.out.println(" ==========실수 표현 =========");

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 공백    ____123.45
        System.out.printf("%10.2f\n",123.45);
        System.out.printf("%10.2f\n",123.453);

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 0    0000123.45
        System.out.printf("%010.2f\n",123.45);

        System.out.println("=======문자열 표현============");

        //문자열은 %s 포맷      abc 출력
        System.out.printf("%s\n","abc");

        //문자열은 %s 포맷      ___abc 출력
        System.out.printf("%6s\n","abc");

        // 특수 문자 \t , \n %%
        System.out.printf("소금물의 농도 %% %1$d\n",35);
    }
}
