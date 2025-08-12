package java_advanced_01.day13.homework_solv.prob01;

public abstract class Animal {
	int speed;
	double distance;
	Animal(){}
	Animal (int speed){
		this.speed=speed;
	}
	abstract void run (int hours);
	
	double getDistance(){
		return distance;
	}
}
