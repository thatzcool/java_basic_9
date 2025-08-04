package javabasic_02.day09.methodbasic;

public class MyCalculator {
    int[] numbers = new int[2];   //수를 저장하는 정수형배열

    public void adder(int[] numbers){
          int n1 = numbers[0];
          int n2 = numbers[1];
        System.out.println(n1 + n2);
    }
}
