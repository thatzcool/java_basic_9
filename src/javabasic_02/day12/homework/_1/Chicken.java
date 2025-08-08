package javabasic_02.day12.homework._1;

public class Chicken extends Animal implements Cheatable{

	Chicken(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.speed*=2;
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		distance+=(double)speed*hours;
	}

}
