package javabasic_02.day07;



public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        char char1 = 'a';
        char1 = 65;
        System.out.println((char) char1);

        c[0] = 97;
        c[1] = 112;
        c[2] = 112;
        c[3] = 108;
        c[4] = 101;

        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            System.out.print(c1);
        }

        char1 = Character.toUpperCase('a');
        System.out.println(char1);


        char[] apple = {'A', 'P', 'P', 'L', 'E'};
        for (char cc : apple) {
            // System.out.print(String.valueOf(c).toLowerCase());
            System.out.print(Character.toLowerCase(cc));
        }
    }
}
