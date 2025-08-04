package javabasic_02.day09.methodbasic;

public class Example02 {

    public static String greeting() {
        String greeting = "Hello";
        return greeting;
    }

    public static void main(String[] args) {
       String greeting =  greeting();
       System.out.println(greeting);
        System.out.println(greeting + "Java");

        System.out.println(greeting() + "자바 프로그래밍");
    }

}
