package jungol.반복제어문3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop3_140_FE1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int integer = 0;

        int i = 1;
        while(i <= 20) {
            integer = Integer.parseInt(bufferedReader.readLine());
            if(integer == 0) break;
            arrayList.add(integer);
        }

        boolean flag = arrayList.isEmpty();
        if(!flag) {
            int totalValue = arrayList.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            double average = arrayList.stream()
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .orElse(0.0);
            System.out.printf("%1$d %2$d",totalValue,(int)average);
        } else System.out.println("값이 없습니다.");

        bufferedReader.close();
    }
}
