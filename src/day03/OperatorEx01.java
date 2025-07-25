package day03;

public class OperatorEx01 {
    public static void main(String[] args) {
        //부호 연산 : 변수의 부호를 유지하거나 변경한다.
        byte b = 100;
        System.out.println(b);
        //정수 타입 (byte, short,int)의 연산결과는 int 타입으로 저장해야한다.
        int a = -b;
        System.out.println(a);

        int c = -a;
        System.out.println(c);

        //2. 증감연산자 : 변수의 값을 1 증가시키거나 1감소시킴
        // ++x, --x  prefix
        // x++ , x-- postfix

        // ++x, x++   => i = i + 1
        // --x , x--  => i = i - 1;

        int x = 1;
        int y = 1;

        int result1 =  ++x + 10;  //(x = x+1) + 10 => 12
        System.out.println(result1);

        int result2 =  y++ + 10;
        System.out.println(result2 + " " + y);

        System.out.println(y++ + 10);

        int x1 = 10;
        int y1 = 10;
        int z;

        x1++;    // x1 = x1 + 1
        ++x1;    // x1 = x1 + 1
        System.out.println("x1 : " + x1);

        System.out.println("------------");

        y1--;
        --y1;
        System.out.println("y1 : " + y1);

        System.out.println("------------");
        z = x1++;
        System.out.println("z : " + z  + " x1 :" + x1);

        System.out.println("------------");
        z = ++x1   +  y1++;
        System.out.println("z :" + z  + " " + y1);

        System.out.println(y1);

    // 산술연산자  +, - , * , / , %(나머지)
          byte v1 = 10;
          byte v2 = 4;
          int v3 = 5;
          long v4 = 10L;

        int result4 = v1 + v2;    //모든 피연산자는 int타입으로 자동변환 후 연산
        System.out.println(result4);
        long result5 = v1 + v2 -v4;  //모든 피연산자는 long 타입으로 promotion 연산
        System.out.println(result5);
        double result6 = (double)v1/v2;   //double로 타입 강제변환 후 연산
        System.out.println(result6);

        int result7 = v1 % v2;
        System.out.println(result7);

        if(10 % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("");
        }


        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7 ;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각 : " + result);
        System.out.println("사과 1개에서 남은 양 : " + result/10.0);


        int k = 5;
        int result8 = k/2;
        System.out.println(result8);

    }

    //비교 연산자 동등( == , !=) , 크기( <, <= , >, >=) 를 평가해서 boolean타입인 true, false 산출한다.







}
