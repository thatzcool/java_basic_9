package javabasic_01.day02;

public class VariableEx01 {
    public static void main(String[] args) {
        // 1. 정수형 변수 value 를 선언하세요
              int value;     //변수 선언시 데이터 타입 변수이름; 선언 한다.

        // 2. 변수 value에 20을 저장(할당)하세요
              value  = 20;   // 한줄 주석
        //3.  변수 result에 value변수에 30을 더한 후 저장하세요
              int result = value + 30;
        //4.  변수 result 의 값을 콘솔에 출력하세요
        System.out.println(result);
        int  x = 0xB3;
        int y = 0x2A0F;

        System.out.println(x);

        byte var1 = -128;
        byte var2 = (byte) 128;
        System.out.println(var2);




    }
}
// 변수는 데이터타입 변수명으로 선언한 뒤 변수는 초기화가 필요하다.
