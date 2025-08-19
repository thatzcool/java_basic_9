package java_advanced.day16.comparableEx;

import java.util.TreeSet;

//과일이 있다. 과일을 가격기준으로 오름차순 정렬할 수 있도록 비교기를 구현하세요
public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.price < o.price) return  -1;
        else if(this.price > o.price) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Fruit 사과 = new Fruit("사과",10000);
        Fruit 귤 = new Fruit("귤",12000);
        Fruit 복숭아 = new Fruit("포도",18000);
        Fruit 포도 = new Fruit("복숭아",8000);

        TreeSet<Fruit> 총각네과일가게 = new TreeSet<Fruit>();
        총각네과일가게.add(사과);
        총각네과일가게.add(귤);
        총각네과일가게.add(복숭아);
        총각네과일가게.add(포도);

        for (Fruit fruit : 총각네과일가게) {
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }
}
// int compareTo (o1, o2같다면 0를 리턴, o1,o2 앞에오게하려면 음수린턴, 뒤에 오게 하려면 양수리턴)

//사과 10000원
//귤 12000원
//복숭아 8000원
//포도 18000원
//총각네과일가게 TreeSet 에 넣어 가격관리한다.
//총각네과일가게 상품리스트를 오름차순 순서대로 출력하세요