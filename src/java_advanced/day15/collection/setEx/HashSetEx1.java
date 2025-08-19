package java_advanced.day15.collection.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String>   set = new HashSet<String>();

        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("JSP");
        set.add("Spring");

        int size = set.size();
        System.out.println(size);
    }
}
