package javabasic_02.day11.inheritance.sec11;

public  class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}