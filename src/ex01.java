public class ex01 {

    public static void main(String[] args) {
        // 3개의 정수를 10,11,12 를 더하여 결과를 출력하세요
        int num1, num2, num3, sum;   //정수형 변수 선언

        //각 변수에 값을 할당
        num1 = 12;
        num2 = 13;
        num3 = 14;

        //연산
        sum =  num1 + num2 + num3;

        //출력
        System.out.println("10+11+12 = " + sum);
        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum);
        System.out.printf("%d + %d + %d = %d " ,num1,num2,num3,sum);


    }

}
