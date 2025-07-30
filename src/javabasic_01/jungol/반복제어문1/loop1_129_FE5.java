package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop1_129_FE5 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int base = 0;
        int height = 0;
        double triangle_width = 0;
        String answer = "";

        boolean flag = true;
        while(flag) {
            base = Integer.parseInt(bufferedReader.readLine());
            height = Integer.parseInt(bufferedReader.readLine());
            triangle_width = ((double)base*height)/2;
            System.out.printf("Base = %d\n", base);
            System.out.printf("Height = %d\n", height);
            System.out.printf("Triangle width = %.1f\n", triangle_width);
            System.out.printf("Continue? ");
            answer = bufferedReader.readLine();
            if(answer.equals("Y")||answer.equals("y")) continue;
            else break;
        }
        bufferedReader.close();
    }
}


