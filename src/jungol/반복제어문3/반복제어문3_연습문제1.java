package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {

    public static void main(String[] args) {
        //1. 입력조건 :  1부터 차례로 입력된 수만큼 루프를 돌리면서 누적합을 구하다가
        //2. 처리조건 : 누적합이 입력받은 수보다 크면 루프를 중단하고
        //            마지막으로 더해진 값과 , 누적합을 출력

      Scanner in = new Scanner(System.in);

      int n = in.nextInt();
      int number = 1;
      int total = 0;

      while (number <= n){
          total += number;
          if(total > n) break;
          ++number;
      }

        System.out.printf("%1$d %2$d", number , total);


    }
}
