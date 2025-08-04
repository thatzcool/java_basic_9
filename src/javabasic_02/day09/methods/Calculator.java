package javabasic_02.day09.methods;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static String[] dataSplit(String inputData){
        String[] data = inputData.split(" ");
        return data;
    }
    public static void main(String[] args) {


        while (a) {
            menu();
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            int menuNum = sc.nextInt();
            //split() 구분자를 스페이스       두 수와 계산기능 번호 한줄로 받기    5 6 1
            String inputData = sc.nextLine();
            String[] data = dataSplit(inputData);
            calculator(data);
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(String[] data) {
        int num1, num2, result, menuNum = 0;
        num1 = Integer.parseInt(data[0]);
        num2 = Integer.parseInt(data[1]);
        menuNum = Integer.parseInt(data[2]);

        switch (menuNum) {
            case 1:
                System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
                break;
            case 4:
                System.out.printf("%d /- %d = %d \n", num1, num2, num1 / num2);
                break;
            case 5:
                a = false;
            default:
                System.out.println("숫자만 입력해주세요.");
        }
//        menu2(num1,num2,menuNum,result);
    }

    public static void menu() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");


    }


}
}
