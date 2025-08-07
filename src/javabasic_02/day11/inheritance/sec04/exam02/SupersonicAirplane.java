package javabasic_02.day11.inheritance.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	//상태 필드 선언
	public int flyMode = NORMAL;

	//메소드 재정의

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("SUPERSONIC 모드로 비행합니다.");
		} else {
			super.fly();
		}
	}
}