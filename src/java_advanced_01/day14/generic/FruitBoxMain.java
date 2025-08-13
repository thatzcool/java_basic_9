package java_advanced_01.day14.generic;

public class FruitBoxMain {

    public static void main(String[] args) {
        //제너릭 타입 매개변수에 정수 타입을 할당
       // FruitBox<Integer> intBox = new FruitBox<>();
        //제너릭 타입 매개변수에 실수 타입을 할당
        //FruitBox<Double> intBox = new FruitBox<>();
        //제너릭 타입 매개변수에  문자열 타입을 할당
        //FruitBox<String> intBox = new FruitBox<>();

        FruitBox<Apple> intBox = new FruitBox<>();
        Apple apple = new Apple();
        intBox.add(apple);
        for (int i = 0; i < 5; i++) {
             intBox.add(new Apple());
        }

    }
}
