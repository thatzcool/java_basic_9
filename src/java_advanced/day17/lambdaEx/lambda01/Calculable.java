package java_advanced.day17.lambdaEx.lambda01;

// 함수형 인터페이스임을 보장(선택사항이지만, 컴파일과정에서 추상메소드가 하나인지를 검사하기 때문에 정확한 인터페이스를 작성하는데 도와주는 역할
@FunctionalInterface
public interface Calculable {
    //추상메소드
     void calculate(int num1, int num2);
}
