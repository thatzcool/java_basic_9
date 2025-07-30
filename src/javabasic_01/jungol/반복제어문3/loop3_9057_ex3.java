package javabasic_01.jungol.반복제어문3;

public class loop3_9057_ex3 {
    public static void main(String[] args) {
        for (int i =1; i <= 3; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1; i <= 3; i++){
            for(int j = 3; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
