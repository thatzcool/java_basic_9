package jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop1_127_FE3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;
        boolean flag = true;

        while (flag) {
            try {
                input = Integer.parseInt(bufferedReader.readLine());
                if (input >= 0 && input <= 100) {
                    arrayList.add(input);
                } else if (input < 0 || input > 100) {
                    break;
                } else System.out.println("정수를 입력해주세요.");
            } catch(NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
            }
        }

        int sum = arrayList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", average);

        bufferedReader.close();
    }
}
