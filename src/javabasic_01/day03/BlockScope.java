package javabasic_01.day03;

import java.util.Scanner;

public class BlockScope {
      static Scanner sc1 = new Scanner(System.in);


     public static void main(String[] args) {


        System.out.print("이름입력: ");
        String name = sc1.nextLine();

        for(int i=1; i<=2;i++){
            callName(name);
        }


    }

    private static void callName(String name){
        System.out.println("나의 이름은 "+ name);
        System.out.print("직무입력: ");
        String job = sc1.nextLine();
        System.out.println(job + "입니다.");
    }
}
