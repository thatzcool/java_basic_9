package java_advanced.day13.homework_solv.prob02;

public abstract class Factory {
     int openHour;
    private int closeHour;
    private String name;

    Factory() {
    }

    Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName(){
        return this.name;    //공장이름 반환
    }

    int getWorkingTime(){
        return this.closeHour - this.openHour;   //공장 가동시간 계산하여 반환
    }

   abstract int makeProducts(char skill);
}
