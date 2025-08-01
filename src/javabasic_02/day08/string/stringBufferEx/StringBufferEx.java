package javabasic_02.day08.string.stringBufferEx;

//StringBuffer 주요 메소드
public class StringBufferEx {

    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("초기상태 :" + sb);

        //StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 :" + sb.toString());
        //sb에  "cd" 출력하세요
        System.out.println("문자열 추출 :" + sb.substring(2,4));

        //sb index 2에 "추가" 문자열 삽입 하세요
        System.out.println("문자 추가 : " + sb.insert(2,"추가"));

        //sb에 문자열을 삭제
        System.out.println("문자 삭제 : " + sb.delete(2,4));

         //sb에 문자 붙이기 : append()
        System.out.println("문자 붙이기 : " + sb.append("hijk"));

        //sb의 길이 : length()
        System.out.println("문자열의 길이 : " + sb.length() );

        //buffer 용량
        System.out.println("용량 : " + sb.capacity());

        //문자열의 역순   : reverse()
        System.out.println("문자열의 역순 : " + sb.reverse());

        //현상태 문자열 확인
        System.out.println("마지막 상태 체크 :" + sb);


    }

}
