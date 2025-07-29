package jungol.반복제어문3;

import java.util.Scanner;

public class loop3_552_self5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = i; k<=n; k++){
                System.out.print("*");
            }
            for(int q=n-i;q>=1 ;q--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
