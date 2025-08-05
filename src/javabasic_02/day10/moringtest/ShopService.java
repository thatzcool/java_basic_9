package javabasic_02.day10.moringtest;

public class ShopService {
        //싱글톤 클래스 객체를 담을 인스턴스 변수
       private static ShopService instance;

       //생성자를 private 선언 (외부 new 못하게)
       private ShopService(){}

       public static ShopService getInstance(){
              if(instance == null){
                     instance = new ShopService();
              }
              return  instance;
       }

       public static void main(String[] args) {
              ShopService s1 = ShopService.getInstance();
              ShopService s2 = ShopService.getInstance();
              ShopService s3 = ShopService.getInstance();

              System.out.println(s1.toString());
              System.out.println(s2.toString());
              System.out.println(s3.toString());

              System.out.println(s1 == s2);
              System.out.println(s2 == s3);
       }

}
