package javabasic_01.day03;

public class OperatorEx02 {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;

        //  n1 과 n2 의 값이 같은가?  결과를  result1에 저장하여 출력
        boolean result1 = (n1 == n2);
        System.out.println(result1);

        boolean result2 = (n1 != n2);
        System.out.println(result2);

        boolean result3 = (n1 > n2);
        System.out.println(result3);

        int n3 = 1;
        double n4 = 1.0;
        System.out.println(n3 == n4);

    }
}
