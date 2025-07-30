package javabasic_01.jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_123_FE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        String animal="";

        System.out.print("Number? ");
        number = scanner.nextInt();
        if(number == 1) animal = "dog";
        else if(number == 2) animal = "cat";
        else if(number == 3) animal = "chick";
        else System.out.println("I don't know.");

        System.out.println(animal);
    }
}
