package jungol.반복제어문2_FOR;

import java.util.Scanner;

public class 반복제어문_형성평가10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        if(number1>=number2){
             for(int i = 1; i <=9 ; i++){
                 for(int j= number1; j >= number2; j--){
                     System.out.printf("%d * %d = %2d   ",j,i,j*i);
                 }
                 System.out.println(); //줄바꿈
             }
        }else{
            for(int i = 1; i <=9 ; i++){
                for(int j= number1; j <= number2; j++){
                    System.out.printf("%d * %d = %2d   ",j,i,j*i);
                }
                System.out.println(); //줄바꿈
            }
        }





    }
}
