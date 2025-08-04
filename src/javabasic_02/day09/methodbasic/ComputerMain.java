package javabasic_02.day09.methodbasic;

public class ComputerMain {

    public static void main(String[] args) {
        //Computer 객체 생성
        Computer myCom = new Computer();

        String result = null;

        result = myCom.totalSum(1, 2, 3);
        System.out.println(result);

        result = myCom.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] values = {1,2,3,4,5};
        result = myCom.totalSum(values);

        result = myCom.totalSum(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);

    }

}
