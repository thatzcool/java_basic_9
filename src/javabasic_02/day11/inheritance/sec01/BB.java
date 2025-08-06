package javabasic_02.day11.inheritance.sec01;

public class BB extends AA {
    private int cc = 30;

    void adder() {
       // int result = aa + bb + cc;
        int result = this.getAA() + this.getBb() + cc;

        System.out.println(result);
    }

    public int getCc(){
        return cc;
    }
}
