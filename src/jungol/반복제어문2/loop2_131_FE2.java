package jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class loop2_131_FE2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int integer = 0;


        int i=1;
        while(i<=2){
            integer = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(integer);
            ++i;
        }

        int max = arrayList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = arrayList.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        IntStream intStream = IntStream.rangeClosed(min, max);
        intStream.forEach(e -> System.out.print(e + " "));

        bufferedReader.close();
    }
}
