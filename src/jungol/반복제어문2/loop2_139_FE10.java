package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop2_139_FE10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int danMax = Integer.parseInt(bufferedReader.readLine());
        int danMin = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= 9; i++){
            for(int j = danMax; j >=danMin; j--){
                int multiple = i * j;
                System.out.printf("%1$d * %2$d = %3$2d   ", j, i, multiple);
            }
            System.out.println();
        }
        bufferedReader.close();
    }
}
