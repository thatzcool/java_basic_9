package java_advanced.day13.homework_solv.prob01;

public class Dog extends Animal {


    Dog(int speed) {
        this.speed = speed;
    }


    @Override
    void run(int hours) {
      distance += (double) speed*hours/2;
    }
}
