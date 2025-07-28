package jungol.반복제어문2_FOR;

import java.util.Scanner;

public class 반복제어문_형성평가9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for(int i= 1; i <= number; i++){

            for(int j = 1; j <= number; j++){
                System.out.printf("(%d, %d) ",i,j);
                      }
            System.out.println();

        }

    }
}
