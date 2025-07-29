package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop2_9051_ex5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;

        int i = 1;
        while (i <= 10) {
            input = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(input);
            ++i;
        }
        long evenCount = arrayList.stream()
                        .filter(n -> n%2 == 0)
                        .mapToInt(Integer::intValue)
                        .count();

        System.out.printf("입력받은 짝수는 %d개입니다.", evenCount);

        bufferedReader.close();
    }
}
