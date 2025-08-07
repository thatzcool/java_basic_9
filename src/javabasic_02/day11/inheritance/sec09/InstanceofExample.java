package javabasic_02.day11.inheritance.sec09;

public class InstanceofExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {

        if (person instanceof Student student) {
            System.out.println("학번 :" + student.studentNo);
            student.study();
        }
        System.out.println("name :" + person.name);
        person.walk();
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person person1 = new Person("신세계");
        personInfo(person1);

        //Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("홍길동", 10000);
        personInfo(p2);
    }
}