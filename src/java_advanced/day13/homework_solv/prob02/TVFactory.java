package java_advanced.day13.homework_solv.prob02;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory(){}
    TVFactory(String name, int openH, int closeH){
        super(name, openH,closeH);
    }
    @Override
    int makeProducts(char skill) {
        switch (skill) {
            case 'A':
                return 8 * super.getWorkingTime();
            case 'B':
                return 5 * super.getWorkingTime();
            case 'C':
                return 3 * super.getWorkingTime();
            default:
                return 1;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return  ((TVFactory)partner).makeProducts('C');
    }
}
