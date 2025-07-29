package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_9058_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
           for(int j=n-i; j>=1; j--){
               System.out.print(" ");
           }
           for(int k=1; k<=i;k++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
