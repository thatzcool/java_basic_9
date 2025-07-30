package javabasic_01.day05.continueEx;

public class ContinueEx01 {
  // Continue문은 반복문인 for, while, do-while 에서만 사용된다.
  // 블록 내부에서 continue문이 사용되면, for문의 증감식, 또는 while, do-while문의 조건식으로 바로 이동한다.

  //Continue문은  반복문을을 종료시키지 않고 계속 반복을 수행한다는 점이 break와 다르다.
    public static void main(String[] args) {
         // 1부터 10사이의 수중 짝 수만 출력하고 홀수인 경우 스킵하고 반복으로 넘어가게 작성하세요

           for(int i = 1 ; i <= 10 ; i++) {
               System.out.println("i = " + i);
               if(i % 2 != 0){
                   continue;   //홀수는 스킵 
               }
               System.out.println("결과출력: " + i);   //짝수만 출력
           }

    }
}
