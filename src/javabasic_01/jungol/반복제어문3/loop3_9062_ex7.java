package javabasic_01.jungol.반복제어문3;

public class loop3_9062_ex7 {
    public static void main(String[] args) {
        char alphabet = 97;
        int number = 1;
        for(int i=1; i<=4; i++) {
            for(int j = 97; j<97+i; j++){
                System.out.print((char)alphabet + " ");
                ++alphabet;
            }
            for(int k = 1; k <= 5-i; k++){
                System.out.print(number + " ");
                ++number;
            }
            System.out.println();
        }

    }
}
