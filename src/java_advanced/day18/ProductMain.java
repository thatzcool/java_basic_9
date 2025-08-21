package java_advanced.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        //List<Product> ArrayList products 생성
          List<Product> products = new ArrayList<>();

        // 5개의 제품을 생성하여 products 에 저장해주세요
        for (int i = 0; i < 5; i++) {
              Product product = new Product("상품"+(int) (100*Math.random()),"Product"+i, "신세계",(int) (100000*Math.random()));
              products.add(product);
        }


        //객체 스트림을 얻어서 각 제품의 정보를 출력하세요
          Stream<Product> productStream = products.stream();
          productStream.forEach(System.out::println);

          //productStream.forEach(product -> System.out.println(product));
    }
}
