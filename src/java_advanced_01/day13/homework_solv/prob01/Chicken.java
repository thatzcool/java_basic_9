package java_advanced_01.day13.homework_solv.prob01;

import javabasic_02.day12.homework._1.Cheatable;

public class Chicken extends Animal implements Cheatable {


	Chicken(int speed){
		this.speed = speed;
	}

	@Override
	void run(int hours) {
            distance += (double) speed*hours;
	}

	@Override
	public void fly() {
             this.speed*=2;         //super.speed = super.speed*2;
	}
}
