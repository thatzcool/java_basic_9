package javabasic_02.day11.inheritance.sec07.exam03;



public class ChildExample {
	public static void main(String[] args) {
		//부모 타입으로 자식객체를 생성하세요
         Parent parent = new Child();


		//Parent 타입으로 필드와 메소드 사용
          parent.field1 = "data1111";
		  parent.method1();
		  parent.method2();
		  //parent.field2 = "data22222";
		  //parent.method3();

		//강제 타입 변환
		  Child child =(Child) parent;
		  child.field2 = "data22222";
		  child.method3();
	}
}