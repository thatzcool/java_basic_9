package java_advanced.day17.AnonymousClass.class04;

public class Main {
     public static void main(String[] args) {

         int number1 = 10;
         int number2 = 20;

         //Calculator 클래스를 생성하여 계산 할 수 있도록 크래스 필드에 값을 전달
         Calculator calculator = new Calculator(number1,number2);

         int result = calculator.calculate(new Operate() {
             @Override
             public int operate(int a, int b) {
                 return a +b;
             }
         });

         System.out.println(result);

         int result1 = calculator.calculate(new Operate() {
             @Override
             public int operate(int a, int b) {
                 return a - b;
             }
         });

         System.out.println(result1);

     }
}
