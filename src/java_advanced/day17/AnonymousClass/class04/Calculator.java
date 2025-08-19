package java_advanced.day17.AnonymousClass.class04;

//계산을 담당하는 클래스
public class Calculator {
     //계산이 필요한 두 수를 저장하는 필드
      private final int number1;
      private final int number2;

      public Calculator(int number1, int number2) {
          this.number1 = number1;
          this.number2 = number2;
      }

      //인터페이스 타입을 매개변수로 받는 메소드
     public int calculate(Operate op) {
          return op.operate(this.number1, this.number2);  //매개변수 객체의 메서드 실행하여 결과를 리턴
     }
}
