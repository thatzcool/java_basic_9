package javabasic_02.day12.afternoon.sec02;

public class InterfaceImpl implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("C");
    }

    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }
}
