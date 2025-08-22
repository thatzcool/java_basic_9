package java_advanced.day19.test;

public class Test03 {
    int i;
    Integer iI;

    public void sayHello() {
        System.out.println("say hello");
    }

    public static void sayHi() {
        System.out.println("hi");
    }


    public static void main(String[] args) {
       Test03 test03 = new Test03();
          //iI = 10;
        System.out.println(test03.i);
       // System.out.println(iI);
        test03.sayHello();
        sayHi();

    }
}
  /*클래스의 정적(static) 멤버는 각각의 인스턴스 아닌 클래스에 속하기 때문에
  컴파일 타임에 JVM의 static area에 최적화 되어 저장된다.
  오브젝트가 아닌 클래스를 통해서 직접 정적 메소드를 호출하는 코드로 식별되어, 객체변수가 null이든 아니든 상관없이 호출된다.
   */

