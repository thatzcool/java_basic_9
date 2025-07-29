package jungol.반복제어문2;

public class loop2_548_self8 {
    public static void main(String[] args) {
        for(int i = 2; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                int multiple = i * j;
                System.out.printf("%1$d * %2$d = %3$2d   ", i, j, multiple);
            }
            System.out.println();
        }
    }
}
