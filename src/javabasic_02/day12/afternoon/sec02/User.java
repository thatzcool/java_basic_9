package javabasic_02.day12.afternoon.sec02;

public class User {

    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodC();
        ic.methodA();
        ic.methodB();

    }
}
