package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_545_self5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;
        int i = 1;

        while(i<=10) {
            input = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(input);
            ++i;
        }

        long multipleOf3 = arrayList.stream()
                .filter(n -> n%3 == 0)
                .mapToInt(Integer::intValue)
                .count();

        long multipleOf5 = arrayList.stream()
                .filter(n -> n%5 == 0)
                .mapToInt(Integer::intValue)
                .count();

        System.out.printf("Multiples of 3 : %d\n", multipleOf3);
        System.out.printf("Multiples of 5 : %d", multipleOf5);

        bufferedReader.close();
    }
}
