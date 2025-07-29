package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_122_FE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String result;

        if ((year % 400) == 0) result = "leap year";
        else if (((year % 4) == 0) && ((year % 100) != 0)) result = "leap year";
        else result = "common year";

        System.out.println(result);
    }
}
