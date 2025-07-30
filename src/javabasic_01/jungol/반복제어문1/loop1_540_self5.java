package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop1_540_self5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        boolean flag = true;

        while(flag) {
            try {
                input = Integer.parseInt(bufferedReader.readLine());
                if((input%3)==0) System.out.println(input/3);
                if(input == -1) break;
            } catch(NumberFormatException e) {
                System.out.println("정수를 입력해 주십시오.");
            }
        }
        bufferedReader.close();
    }
}

