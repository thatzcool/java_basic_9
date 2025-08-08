package javabasic_02.day12;

public class Televison implements RemoteControl{
    @Override
    public void trunOn() {
        System.out.println("TV 전원을 켠다");
    }

    @Override
    public void trunOff() {
        System.out.println("TV 전원을 끈다");
    }
}
