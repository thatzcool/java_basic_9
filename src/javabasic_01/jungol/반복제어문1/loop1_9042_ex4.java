package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop1_9042_ex4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;

        boolean flag = true;
        while(flag){
            input = Integer.parseInt(bufferedReader.readLine());
            if(input == 0) break;
            arrayList.add(input);
        }

        long count = arrayList.stream()
                        .mapToLong(Integer::longValue)
                                .count();
        int totalValue = arrayList.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        double average = arrayList.stream()
                        .mapToDouble(Integer::doubleValue)
                        .average()
                        .orElse(0.0);

        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n",totalValue);
        System.out.printf("입력된 자료의 평균 = %.2f",average);

        bufferedReader.close();
    }
}
