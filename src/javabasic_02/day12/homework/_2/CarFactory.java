package javabasic_02.day12.homework._2;

public class CarFactory extends Factory implements IWorkingTogether{

	CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);

	}

	@Override
	public int workTogether(IWorkingTogether partner) {

		
		return ((CarFactory)partner).makeProducts('B'); 
	}

	@Override
	int makeProducts(char skill) {

		switch(skill){
		case 'A':
			return 3*super.getWorkingTime();

		case 'B':
			return 2*super.getWorkingTime();

		case 'C':
			return 1*super.getWorkingTime();

		default :
			return 0;

		}
	}

}
