package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop2_137_FE8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(bufferedReader.readLine());
        int column = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }
        bufferedReader.close();
    }
}
