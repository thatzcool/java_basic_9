package jungol.연산자;

public class Operator_9026_ex8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        System.out.print((a==1||b==1)? 1 + " " : 0 + " ");  // OR
        System.out.print((b==1||c==1)? 1 + " " : 0 + " ");  // OR
        System.out.print((c==1||a==1)? 1 + " " : 0 + " ");  // OR
        System.out.print((a==1^b==1)? 1 + " " : 0 + " ");   // XOR
    }
}
