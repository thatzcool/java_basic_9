package javabasic_01.day02;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = false;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 30;
        boolean result1, result2, result3, result4;

        //변수 x의 값이 20인가? 결과 result1에 저장
        result1 = (x == 20);
        //변수 x의 값이 20이 아닌가? 결과 result2 저장
        result2 = (x != 20);
        //변수 x의 값이 0보다 크고 30보다 작은가? 결과 result3 저장
        result3 = (x > 0 && x < 30);
        //변수 x의 값이 0보다 적거나 30보다 크거나 같은가? 결과 result4 저장
        result4 = (x < 0 || x >= 30);

        // 각 결과 출력   //자동정렬 하기   ctrl + alt + L
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
