package jungol.선택제어문.전체풀이;

import java.util.Scanner;

public class If_533_self6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        int age = scanner.nextInt();

        if (gender.equals("M") && age >= 18) System.out.println("MAN");
        else if (gender.equals("M") && age < 18) System.out.println("BOY");
        else if (gender.equals("F") && age >= 18) System.out.println("WOMAN");
        else System.out.println("GIRL");
    }
}
