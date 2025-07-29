package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_133_FE4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int n = 0;
        int integer = 0;

        n = Integer.parseInt(bufferedReader.readLine());
        int i=1;
        while(i <= n) {
            integer = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(integer);
            ++i;
        }

        double average = arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("%.2f", average);
        bufferedReader.close();
    }
}
