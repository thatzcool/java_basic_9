package javabasic_02.day06.jungol;

import java.util.Scanner;

public class 배열1_연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
          //1. 100개의 정수형 배열에 차례로 입력데이터 저장
               int[] outputArray = new int[100];
               int repeatNum = 0;

          //2. 입력받다가 0이 입력되면, 입력받은 값을 (0인지 아닌지 확인)
                while(repeatNum < 100){

                    outputArray[repeatNum] = in.nextInt();
                    if(outputArray[repeatNum] == 0) {
                        break;
                    }
                    repeatNum++;
                }

          //3. 만약 0이면 입력을 중지하고  짝수번째 입력값(인덱스는 홀수)을 차례로 출력
        for (int i = 0; i < repeatNum; i++) {
            if(i%2 == 1) {
                System.out.printf("%d ", outputArray[i]);
            }
        }
    }
}
