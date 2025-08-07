package javabasic_02.day11.inheritance.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {

		//  Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("신세계");
		smartPhone.turnOn();
		smartPhone.internet();
		smartPhone.turnOff();
	}
}