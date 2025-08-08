package javabasic_02.day12;

public class User1 {

    public static void main(String[] args) {
         Service service = new ServiceImpl2();

         //디폴트 메소드 호출
          service.defaultMethod1();
          service.defaultMethod2();

         //정적 메소드 호출
          Service.staticMethod1();
          Service.staticMethod2();



    }
}
