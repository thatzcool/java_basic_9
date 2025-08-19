package java_advanced.day16.comparatorEx;

import java.util.TreeSet;

public class ComparatorEx {

    public static void main(String[] args) {
        //과일가게에서 과일을 관리할때의 기준(FruitComparator)기준으로 정렬하여 관리 하겠다.


        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());
        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Banana", 5));

        for(Fruit fruit : fruits) System.out.println(fruit.name + " " + fruit.price);
    }
}
