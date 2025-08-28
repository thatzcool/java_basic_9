package java_advanced.day21.pratice;

import java.io.*;
import java.nio.file.*;
import java.util.*;

// 직렬화 대상 클래스들
class Product1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;

    public Product1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product1{name='" + name + "', price=" + price + "}";
    }
}

class Order1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private int orderId;
    private Product1 product; // 합성 관계

    public Order1(int orderId, Product1 product) {
        this.orderId = orderId;
        this.product = product;
    }

    public int getOrderId() { return orderId; }
    public Product1 getProduct() { return product; }

    @Override
    public String toString() {
        return "Order1{orderId=" + orderId + ", product=" + product + "}";
    }
}

public class Prob5 {
    public static void main(String[] args) {
        Path listFile = Paths.get("order_list.dat");
        Path eachFile = Paths.get("order_each.dat");

        // 샘플 주문 2건
        List<Order1> orders = Arrays.asList(
                new Order1(101, new Product1("키보드", 39000)),
                new Order1(102, new Product1("마우스", 27000))
        );

        // -------------------------------------------------
        // 1) 리스트 통째로 저장 & 읽기
        // -------------------------------------------------
        serializeList(listFile, orders);
        System.out.println("=== 리스트 전체 저장 후 읽기 ===");
        List<Order1> readList = deserializeList(listFile);
        for (Order1 o : readList) {
            System.out.println(o);
        }
        System.out.println();

        // -------------------------------------------------
        // 2) 객체 하나씩 저장 & 읽기
        // -------------------------------------------------
        serializeOneByOne(eachFile, orders);
        System.out.println("=== 객체 하나씩 저장 후 읽기 ===");
        deserializeOneByOne(eachFile);
    }

    // 리스트 통째 직렬화
    private static void serializeList(Path path, List<Order1> orders) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(orders);   // List<Order> 한 번에 저장
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 리스트 통째 역직렬화
    @SuppressWarnings("unchecked")
    private static List<Order1> deserializeList(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return (List<Order1>) ois.readObject(); // 통째로 읽어서 캐스팅
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    // 객체 하나씩 직렬화
    private static void serializeOneByOne(Path path, List<Order1> orders) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            for (Order1 o : orders) {
                oos.writeObject(o);     // Order를 개별 저장
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 객체 하나씩 역직렬화 (EOFException으로 끝 감지)
    private static void deserializeOneByOne(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            while (true) {
                try {
                    Order1 o = (Order1) ois.readObject();
                    System.out.println(o);
                } catch (EOFException eof) {
                    System.out.println("모든 주문을 읽었습니다");
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

