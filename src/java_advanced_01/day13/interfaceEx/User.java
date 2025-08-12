package java_advanced_01.day13.interfaceEx;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();



    }
}
