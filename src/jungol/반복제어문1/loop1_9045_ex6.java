package jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop1_9045_ex6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        boolean flag = true;

        while(true) {
            try {
                System.out.println("1. 입력하기");
                System.out.println("2. 출력하기");
                System.out.println("3. 삭제하기");
                System.out.println("4. 끝내기");
                System.out.print("작업할 번호를 선택하세요. ");

                input = Integer.parseInt(bufferedReader.readLine());
                if (input == 1) System.out.println("\n입력하기를 선택하였습니다.\n");
                else if (input == 2) System.out.println("\n출력하기를 선택하였습니다.\n");
                else if (input == 3) System.out.println("\n삭제하기를 선택하였습니다.\n");
                else if (input == 4) {
                    System.out.println("\n끝내기를 선택하였습니다.\n");
                    break;
                } else System.out.println("\n잘못 입력하였습니다.\n");
            } catch(NumberFormatException e) {
                System.out.println("\n보기에 있는 숫자를 입력해주세요.\n");
            }
        }
        bufferedReader.close();
    }
}
