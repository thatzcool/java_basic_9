package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class loop1_9043_ex5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>();
        int integer = 0;

        while(true) {
            try {
                integer = Integer.parseInt(bufferedReader.readLine());
                if (integer == 0) break;
                integerList.add(integer);
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력하세요.");
            }
        }

        boolean flag = integerList.isEmpty();
        if (!flag) {
            int totalValue = integerList.stream()
                    .filter(n -> n % 2 == 1)
                    .mapToInt(Integer::intValue)
                    .sum();

            double average = integerList.stream()
                    .filter(n -> n % 2 == 1)
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .orElse(0.0);

            System.out.printf("홀수의 합 = %d\n", totalValue);
            System.out.printf("홀수의 평균 = %d\n", (int)average);
        } else {
            System.out.println("홀수가 없습니다.");
        }

        bufferedReader.close();
    }
}
