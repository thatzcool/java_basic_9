package javabasic_02.day09.methodbasic;

public class CalMain {
    public static void main(String[] args) {

        MyCalculator myCalculator1 = new MyCalculator();
        myCalculator1.numbers[0] = 10;
        System.out.println(myCalculator1.numbers[0]);
        myCalculator1.numbers[1] = 20;
        System.out.println(myCalculator1.numbers[1]);
        myCalculator1.adder(myCalculator1.numbers);


    }
}
