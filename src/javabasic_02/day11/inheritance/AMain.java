package javabasic_02.day11.inheritance;

public class AMain {

    public static void main(String[] args) {
            A  Aaddress1 = new A();
            A  Aaddress2 = new A("박용헌", 26);

        System.out.println(Aaddress1.hashCode());
        System.out.println(Aaddress2.hashCode());

        System.out.println(Aaddress1.getAa());
        System.out.println(Aaddress1.getBb());

    }
}
