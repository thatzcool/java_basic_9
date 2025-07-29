package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_9052_ex6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int score = 0;

        int i = 1;
        while(i <= 5){
            score = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(score);
            ++i;
        }

        int totalValue = arrayList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("총점 : %d\n", totalValue);
        System.out.printf("평균 : %.1f", average);

        bufferedReader.close();
    }
}
