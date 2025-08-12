package java_advanced_01.day13.homework_solv.prob02;

public class CarFactory extends Factory implements IWorkingTogether {

    CarFactory() {
    }

    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {

        switch (skill) {
            case 'A':
                return 3 * super.getWorkingTime();
            case 'B':
                return 2 * super.getWorkingTime();
            case 'C':
                return 1 * super.getWorkingTime();
            default:
                return 0;
        }

    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return  ((CarFactory)partner).makeProducts('B');
    }
}
