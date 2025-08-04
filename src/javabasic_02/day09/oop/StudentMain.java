package javabasic_02.day09.oop;

//학생인스턴스 생성을 위한 실행 클래스
public class StudentMain {

    public static void main(String[] args) {
         Student  경민 = new Student();
         Student  우혁 = new Student("강우혁","12345");
         Student  형근 = new Student("김형근",27, "경기도 의정부시","1234567");
         Student  기웅 = new Student("박기웅",25, "서울시 강남구","12345678");

        System.out.println(경민.toString());
        System.out.println(우혁.toString());
        System.out.println(형근.toString());
        System.out.println(기웅.toString());
        System.out.println(기웅.getStu_name());
        System.out.println(기웅.getAddress());
        String 기웅주소 = 기웅.getAddress();
        System.out.println(기웅주소 + "에 살고 있습니다.");
        기웅.gender ="남자";
        경민.gender ="남자";
        System.out.println(기웅.gender);
        System.out.println(경민.gender);

    }
}
