package java_advanced_01.day14.generic.ex01;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Pear extends Fruit{}
class Banana extends Fruit{}

class FruitBox<T>{
    List<T> fruits = new ArrayList<>();
    public void add(T fruit){
        fruits.add(fruit);
    }
}

public class Main {
    public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();

        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());
        box.add(new Pear());


    }


}
