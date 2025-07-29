package jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop1_539_self4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList();
        int input = 0;

        boolean flag = true;
        while(flag){
            input = Integer.parseInt(bufferedReader.readLine());
            arrayList.add(input);
            if(input >= 100) break;
        }

        int totalValue = arrayList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("%1$d\n%2$.1f",totalValue,average);
    }

}
