package day05.whileEx;

public class WhileEx01 {
    public static void main(String[] args) {
         // 1부터 10까지 출력하는 프로그램 - while문을 이용
         int loop = 1;
         while(loop <= 10){

             System.out.print(loop + " ");
             loop += 1;     //loop++;   loop = loop + 1;
         }
    }
}
