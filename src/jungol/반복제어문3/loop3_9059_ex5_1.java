package jungol.반복제어문3;

public class loop3_9059_ex5_1 {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            for(int j = 5-i; j >= 1; j--){
                System.out.print(" ");
            }

            for(int p = 1; p<=i; p++){
                System.out.print("*");
            }

            for(int q = 6-i ; q<5; q++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
