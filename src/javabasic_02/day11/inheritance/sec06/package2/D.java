package javabasic_02.day11.inheritance.sec06.package2;


import javabasic_02.day11.inheritance.sec06.package1.A;

public class D extends A {


    //생성자 선언
    public D() {
        super();    // extends A 의 기본 생성자를 호출하여라 
    }

    //메소드 선언
    public void method1() {   //상속을 통해서만 사용 가능
        this.field = "value";   
        this.method();
    }


    //메소드 선언
    public void method2() { //직접 객체 생성해서 사용 안됨
//          A a = new A();
//          a.field ="value";
//          a.method();
    }

}