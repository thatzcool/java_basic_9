package javabasic_01.jungol.선택제어문.전체풀이;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class If_124_FE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        LocalDate localDate = LocalDate.of(2023, month, 1);

        LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        String day = lastDayOfMonth.format(DateTimeFormatter.ofPattern("dd"));

        System.out.println(day);
    }
}
