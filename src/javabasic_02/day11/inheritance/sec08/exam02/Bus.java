package javabasic_02.day11.inheritance.sec08.exam02;

public class Bus  extends Vehicle {
	//메소드 재정의(오버라이딩)


    @Override
    public void run() {
        System.out.println("버스가 달린다.");
    }
}