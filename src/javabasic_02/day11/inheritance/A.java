package javabasic_02.day11.inheritance;

public class A extends Object {
    private String aa;
    private int bb;

    A() {
    }

    A(String a, int b) {
        super();
        this.aa = a;
        this.bb = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "aa='" + aa + '\'' +
                ", bb=" + bb +
                '}';
    }

    public String getAa() {
        return aa;
    }

    public int getBb() {
        return bb;
    }
}
