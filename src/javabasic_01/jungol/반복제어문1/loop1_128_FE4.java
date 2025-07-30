package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop1_128_FE4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;
        long result = 0;

        boolean flag1 = true;
        while(flag1) {
            input = Integer.parseInt(bufferedReader.readLine());
            if(input == 0) break;
            arrayList.add(input);
        }

        boolean flag2 = arrayList.isEmpty();
        if(!flag2) {
            result = arrayList.stream()
                    .filter(n -> (n%3 != 0) && (n%5) != 0 )
                    .mapToInt(Integer::intValue)
                    .count();
            System.out.println(result);
        } else System.out.println("입력된 수가 없습니다.");

        bufferedReader.close();
    }
}
