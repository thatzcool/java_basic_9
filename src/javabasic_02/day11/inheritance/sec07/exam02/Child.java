package javabasic_02.day11.inheritance.sec07.exam02;

public class Child extends Parent {
      public String childName = "이마트";
  
	//메소드 오버라이딩
 
    
    @Override
    public void method1() {
        System.out.println(this.name);
        System.out.println(this.childName);
        super.method1();
        System.out.println("나는 자식의 method1()");
    }

    @Override
    public void method2() {
        System.out.println("나는 자식의 method2()");
    }
    //메소드 선언
    public void method3() {
        System.out.println("나는 자식의 method3()");
    }

}