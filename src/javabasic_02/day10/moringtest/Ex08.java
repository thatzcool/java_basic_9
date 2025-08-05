package javabasic_02.day10.moringtest;

public class Ex08 {

    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int totalsum = 0;
        double average = 0.0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                totalsum += array[i][j];
                count++;
            }
        }

        average = (double) totalsum/count;
        System.out.println(totalsum);
        System.out.println(average);

    }


}
