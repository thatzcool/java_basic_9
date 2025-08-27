package java_advanced.day21.pratice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String orderId;
    private Product product;
}

/*
 1. 리스트 저장 방식
    객체 묶음을 한 번에 저장/읽기.
    간단하고 코드가 짧음. 단, 리스트 전체를 통째로 읽기 때문에 부분 처리 어려움이 있다.


 2. 객체 하나씩 저장 방식
   스트림처럼 순서대로 직렬화/역직렬화 가능.
   큰 데이터 처리나 부분 처리에 유리하다.
   While로 처리하기 때문에 EOFException으로 끝을 감지해야 한다.

 */
public class Prob1 {
    public static void main(String[] args) {
        String listFile = "order_list.dat";
        String oneByOneFile = "order_each.dat";

        Product jelly = new Product("마이구미", 1000);
        Product cookie = new Product("촉촉한 초코칩", 2500);

        List<Order> orders = Arrays.asList(
                new Order("하원", jelly),
                new Order("예림", cookie)
        );

        // -----------------------------
        // 1) 리스트 통째로 저장 & 읽기
        // -----------------------------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(listFile))) {
            oos.writeObject(orders); // 리스트 전체 직렬화
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("=== 리스트 전체 저장 후 읽기 ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(listFile))) {
            @SuppressWarnings("unchecked")
            List<Order> readList = (List<Order>) ois.readObject();
            for (Order order : readList) {
                Product p = order.getProduct();
                System.out.println("주문자: " + order.getOrderId());
                System.out.println("상품: " + p.getName());
                System.out.println("가격: " + p.getPrice());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // -----------------------------
        // 2) 객체 하나씩 저장 & 읽기
        // -----------------------------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(oneByOneFile))) {
            for (Order order : orders) {
                oos.writeObject(order); // Order 객체 개별 저장
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("=== 객체 하나씩 저장 후 읽기 ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(oneByOneFile))) {
            while (true) {
                try {
                    Order order = (Order) ois.readObject();
                    Product p = order.getProduct();
                    System.out.println("주문자: " + order.getOrderId());
                    System.out.println("상품: " + p.getName());
                    System.out.println("가격: " + p.getPrice());
                    System.out.println();
                } catch (EOFException eof) {
                    System.out.println("모든 주문을 읽었습니다.");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}