package javabasic_01.day05.whileEx;

public class DoWhileEx1 {
    public static void main(String[] args) {

          int x = 10;
          int sum = 0;

          do {
              System.out.println("현재 x :" + x);
              sum += x;
              x--;
              System.out.println("처리 후 x, sum : " + x + " " + sum);
          } while(x >=5);
        System.out.println("-----------------------");
        System.out.println("최종 sum : " + sum);
    }
}
