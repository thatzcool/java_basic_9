package day05.whileEx;

public class WhileEx02 {
    public static void main(String[] args) {
        // 1부터 100까지 합을 출력하는 프로그램 - while문을 이용
        int loop = 1;
        int total = 0;

        while (loop <= 100) {
            total += loop;
            loop += 1;     //loop++;   loop = loop + 1;
        }
        System.out.println("1- 100의 합 = " + total);
    }
}
