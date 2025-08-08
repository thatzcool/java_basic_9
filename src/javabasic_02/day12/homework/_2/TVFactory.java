package javabasic_02.day12.homework._2;

public class TVFactory extends Factory implements IWorkingTogether{

	TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);

	}

	@Override
	public int workTogether(IWorkingTogether partner) {

		return ((TVFactory)partner).makeProducts('C');
	}

	@Override
	int makeProducts(char skill) {

		switch(skill){
		case 'A':
			return 8*super.getWorkingTime();

		case 'B':
			return 5*super.getWorkingTime();

		case 'C':
			return 3*super.getWorkingTime();

		default :
			return 1*super.getWorkingTime();

		}
	}

}
