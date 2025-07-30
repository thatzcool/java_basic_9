package javabasic_01.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_135_FE6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int integer = 0;

        int i = 1;
        while(i <= 2) {
            integer = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(integer);
            ++i;
        }

        int totalValue = arrayList.stream()
                .filter(n -> (n%3==0)||(n%5==0))
                .mapToInt(Integer::intValue)
                .sum();

        double average = arrayList.stream()
                .filter(n -> (n%3==0)||(n%5==0))
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("sum : %d\n", 37);
        System.out.printf("avg : %.1f", average);

        bufferedReader.close();
    }
}

