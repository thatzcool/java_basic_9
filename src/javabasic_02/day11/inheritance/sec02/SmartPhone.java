package javabasic_02.day11.inheritance.sec02;

public class SmartPhone extends Phone {
    //필드 선언
    public boolean wifi;

    //생성자 선언
    public SmartPhone() {
        super();
    }

    public SmartPhone(String model, String color) {
        super(model, color);   // 부모생성자가 호출된다.
    }

    //메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}