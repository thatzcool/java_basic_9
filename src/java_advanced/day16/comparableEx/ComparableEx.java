package java_advanced.day16.comparableEx;

import java.util.TreeSet;

public class ComparableEx {

    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        Person p2 = new Person("Adam", 21);
        Person p3 = new Person("Aami", 27);

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        for (Person p : treeSet) {
            System.out.println();
        }

    }
}
