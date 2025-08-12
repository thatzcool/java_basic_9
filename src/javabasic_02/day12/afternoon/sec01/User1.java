package javabasic_02.day12.afternoon.sec01;

public class User1 {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");


        SmartTelevision st =(SmartTelevision) rc;


    }
}
