package jungol.반복제어문2;

public class loop2_9054_ex8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for(int j = 2; j <= 4; j++) {
                int multiple = i * j;
                System.out.printf("%1$d * %2$d = %3$2d\t", j, i, multiple );
            }
            System.out.println();
        }
    }
}
