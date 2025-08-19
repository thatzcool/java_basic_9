package java_advanced.day17.lambdaEx;

public class Main1 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello lambda");
            }
        };

        Runnable runnable1 =  ()-> System.out.println("Hello");
    }
}
