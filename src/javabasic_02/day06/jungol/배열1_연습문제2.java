package javabasic_02.day06.jungol;

public class 배열1_연습문제2 {
    public static void main(String[] args) {

        //1. 26개의 알파벳 대문자를 A~Z 까지 차례로 입력
        //1-1. 동일한 데이터타입 char 연속된 값을 저장 => 배열
        char[] alphabets = new char[26];   //배열은 길이를 먼저 정하고 생성해야 한다.
        //1-2. 문자형 배열을 선언하고 차례차례 A~Z까지 값을 대입하여 저장
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) ('A' + i);
        }
        System.out.println("=====전통 for방식으로 인덱스를 조정하여 끝부터 처음까지 출력=====");
        for (int i = alphabets.length-1; i >= 0; i--) {
            System.out.printf("%c ",alphabets[i]);
            
        }
        System.out.println();
        System.out.println("=====향상된 for방식으로 처음부터 끝까지 출력=====");
        for (char alphabet : alphabets) {
            System.out.printf("%c ",alphabet);
        }
        //1-3. 배열의 마지막부터 처음까지 각 문자를 출력

    }

}
