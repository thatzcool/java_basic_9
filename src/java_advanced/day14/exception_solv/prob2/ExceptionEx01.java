package java_advanced.day14.exception_solv.prob2;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "lOO"};
            for (int i = 0; i < array.length; i++) {
                String string = array[i];
                Integer number = Integer.parseInt(string);
                System.out.println(number);
            }
        } catch (Exception e){
            e.getMessage();
        }

        System.out.println("프로그램 종료");

//          array에서 값을 추출해서 숫자로 바꾸어 출력하려고한다
//          해당 예외사항을 예측하여 처리하세요
    }

}
