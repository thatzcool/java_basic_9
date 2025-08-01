package javabasic_02.day08.string.stringBufferEx;

public class StringEx01 {

    public static void main(String[] args) {
          String result = "";
          result += "Hello";
          result += " ";
          result += "Java Programming";
        System.out.println(result);
        // + 연산자를 이용하여 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String인스턴스 생성
        // 문자열을 많이많이 결합할 수록 메모링 낭비, 속도 도 느려지는 단점이 있다.
        //StringBuffer 클래스는 클래스 내부에 버퍼(buffer)라는 독립적인 공간을 가지고 있어 문자열을
        //바로 바로 추가할 수 있어 공간의 낭비없이 문자열 연산 속도를 빠르게 처리할 수 있다. 

        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append("");
        sb1.append("java programming ");
        sb1.append("!!!");
        String result1 = sb1.toString();
        System.out.println(result1);

    }
}
