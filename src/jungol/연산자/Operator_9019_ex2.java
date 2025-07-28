package jungol.연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator_9019_ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];  //배열 array

        System.out.print("5개의 수를 입력하시오. ");
        for(int i = 0; i < 5; i++){
            int input = Integer.parseInt(bufferedReader.readLine());

            switch(i) {
                case 0 -> {array[i] = input + 3 ; }
                case 1 -> {array[i] = input - 3 ; }
                case 2 -> {array[i] = input * 3 ; }
                case 3 -> {array[i] = (int)(input / 3) ; }
                case 4 -> {array[i] = input % 3 ; }
            }
        }

        for(int i : array) {
            System.out.print(i + " ");
        }

        bufferedReader.close();
    }
}
