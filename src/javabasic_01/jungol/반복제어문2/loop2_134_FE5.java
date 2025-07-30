package javabasic_01.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_134_FE5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int integer = 0;

        int i = 1;
        while(i <= 10) {
            integer = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(integer);
            ++i;
        }

        long evenCount = arrayList.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue)
                .count();

        long oddCount = arrayList.stream()
                .filter(n -> n%2 == 1)
                .mapToInt(Integer::intValue)
                .count();

        System.out.printf("even : %d\n", evenCount);
        System.out.printf("odd : %d", oddCount);

        bufferedReader.close();
    }
}
