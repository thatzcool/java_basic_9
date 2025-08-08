package javabasic_02.day11.inheritance.sec10.exam02;

public  abstract class Animal {
	//메소드 선언
       public void breathe(){
           System.out.println("동물은 숨을 쉰다.");
       }

	//추상 메소드 선언
     public abstract void sound();


}