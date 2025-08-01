package javabasic_02.day08;

/*
똑같은 변수 a의 주소값을 출력하였다.
문자열이 변경됨에 따라 주소값이 바뀌어 있음을 확인
즉, 문자열 값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자열데이터 객체를 대입하여 새로운 공간에 값이 할당됨을 확인
*/

public class RefEx02 {

    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        a += "Java Programming";
        System.out.println(a.hashCode());
        System.out.println(a);
    }
}
