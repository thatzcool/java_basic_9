package javabasic_01.day04;

public class RandomEx01 {

    public static void main(String[] args) {
          Math.random();       // 0.0 <= Math.random() <1.0
         // 0.0*6 <= Math.random() <1.0*6
         //(int) 0.6  <=  Math.random() < (int)6.0
         // 0 <=  Math.random()  < 6    //0,1,2,3,4,5
         //(0+1) <= ((int)(Math.random() *6)+1) < 6+1

        int number =  (int)(Math.random() * 45) + 1;


        //start부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드를 작
        //int num =  (int)(Math.random() * n) + start


        System.out.println("3번을 연달아 주사위를 던지고 나온 값을 출력하세요");

        int num = 0;

        for(int i = 1 ; i <4 ; i++){
            num = (int) (Math.random() * 6) + 1;
            System.out.println(i+"번째 나온 주사위 수 " + num);
        }


    }
}
