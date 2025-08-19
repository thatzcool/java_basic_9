package java_advanced.day15.collection.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //객체 저장  (INSERT,CREATE,SAVE )
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        map.put("D", 1);

        System.out.println(map.size());

        //하나의 객체 읽기  (Read, Get) ==> Key 를 이용하여 읽기
        String key = "A";
        int value = map.get(key);
        System.out.println("키를 이용하여 값 확인 " + value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 읽고 싶다.
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();  //키를 반복하기 위해 반복자를 생성
        while (iterator.hasNext()) {
            String key1 = iterator.next();
            Integer value2 = map.get(key1);
            System.out.println(key1 + " : " + value2);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
            System.out.println();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        System.out.println();

        //키로 엔트리 삭제
        map.remove("B");
        System.out.println(map.size());
        System.out.println();
    }
}
