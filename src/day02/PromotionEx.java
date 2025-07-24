package day02;

public class PromotionEx {
    public static void main(String[] args) {

        //byte<short,char<int<long<float<double

        byte byteValue = 10;
        int intValue = byteValue;   //자동타입 변환

        long longValue =  500000000L;  //long 리터럴 정의시 L, l을 뒤에 붙인다.
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        // e 또는 E 가 포함된 10의 거듭제곱 리터럴

        double d1 = 5e2;     // 5.0 x 10 x 10 = 500.0
        double d2 = 0.12E-2;   //0.12 x 0.01  = 0.0012
        double d3 = 3.14;
        double d4 = 314e-2;
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        float f1 = 3.14f;   //float 리터럴 값은 마지막에 f,F를 붙인다.
        float f2 = 3E6F;
        System.out.println(f1 + " " + f2);
    }
}
