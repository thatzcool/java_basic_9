package javabasic_02.day12.homework._1;

public class Dog extends Animal{

	Dog(int speed) {
		super(speed);

	}

	@Override
	void run(int hours) {

		distance+=(double)speed*hours/2;
	}

}
