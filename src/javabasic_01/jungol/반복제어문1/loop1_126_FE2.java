package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class loop1_126_FE2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        int input = 0;
        boolean flag1 = true;

        while(flag1) {
            try{
                input = Integer.parseInt(bufferedReader.readLine());
                if(input == 0) break;
                arrayList.add(input);
            }catch(NumberFormatException e){
                System.out.println("정수를 입력해주세요.");
            }
        }

        boolean flag2 = arrayList.isEmpty();
        if(!flag2) {
            long odd = arrayList.stream()
                    .filter(n -> n%2 == 1)
                    .mapToInt(Integer::intValue)
                    .count();
            long even = arrayList.stream()
                    .filter(n -> n%2 ==0)
                    .mapToInt(Integer::intValue)
                    .count();

            System.out.printf("odd : %d\n", odd);
            System.out.printf("even : %d", even);
        } else {
            System.out.println("수가 없습니다.");
        }

        bufferedReader.close();
    }
}
