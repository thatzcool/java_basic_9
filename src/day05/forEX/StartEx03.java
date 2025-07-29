package day05.forEX;

public class StartEx03 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if(i<j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("======================");

    }
}
