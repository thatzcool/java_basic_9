package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_141_FE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        boolean flag = true;

        int i = 1;
        while(flag) {
            System.out.print((integer*i) + " ");
            if((integer*i)%10==0) break;
            ++i;
        }
    }
}

