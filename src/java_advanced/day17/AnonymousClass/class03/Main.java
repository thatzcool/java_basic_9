package java_advanced.day17.AnonymousClass.class03;

class Animal {
    public String eat() {
        return "맛있게 먹습니다.";
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public String eat() {
               String run = run();
                return "강아지 멍멍" + run;
            }

            public String run() {
                return "강아지가 뛴다.";
            }
        };

        String eat = dog.eat();
        System.out.println(eat);
        //dog.run();
    }
}
//새로 정의한 메소드는 외부 스코프에서 호출될 수 없고, 익명 클래스 내에서만 호출 가능하다