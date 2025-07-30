package javabasic_01.jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class loop1_633_self6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("Korea", "Seoul");
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("China", "Beijing");

        boolean flag = true;
        int input = 0;

        while(flag) {
            try{
                System.out.println("1. Korea");
                System.out.println("2. USA");
                System.out.println("3. Japan");
                System.out.println("4. China");
                System.out.print("number? ");

                input = Integer.parseInt(bufferedReader.readLine());

                if (input == 1) System.out.println("\n"+capitalMap.get("Korea")+"\n");
                else if (input == 2) System.out.println("\n"+capitalMap.get("USA")+"\n");
                else if (input == 3) System.out.println("\n"+capitalMap.get("Japan")+"\n");
                else if (input == 4) System.out.println("\n"+capitalMap.get("China")+"\n");
                else {
                    System.out.println("\nnone");
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("보기에 있는 숫자를 입력해주세요.");
            }

        }
        bufferedReader.close();
    }
}
