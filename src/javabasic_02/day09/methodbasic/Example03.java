package javabasic_02.day09.methodbasic;

public class Example03 {
    public static void main(String[] args) {
        int result =   division();
        System.out.println(result);

    }

    public static int division() {
        int n1 = 10, n2 = 5, result = 0;
        if(n2 != 0) {
          result = n1/n2;
        } else System.out.println("0으로 나누기 금지");
        return result;
    }
}
