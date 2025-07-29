package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_546_self6 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int n = 0;
        int score = 0;
        String result = "";

        n = Integer.parseInt(bufferedReader.readLine());
        int i = 1;
        while(i <= n) {
            score = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(score);
            ++i;
        }

        double average = arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        if(average >= 80) result = "pass";
        else result = "fail";

        System.out.printf("avg : %.1f\n", average);
        System.out.printf(result);

        bufferedReader.close();
    }
}
