package javabasic_02.day11.inheritance.sec09;

public class Person {
	//필드 선언
	public String name;

	//생성자 선언
	public Person(String name) {
		this.name = name;
	}

	//메소드 선언
	public void walk() {
		System.out.println("걷습니다.");
	}
}