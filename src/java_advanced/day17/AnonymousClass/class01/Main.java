package java_advanced.day17.AnonymousClass.class01;
class Animal{
    public String eat(){
        return "맛있게 먹습니다.";
    }
}

class Dog extends Animal{
    @Override
    public String eat() {
        return "강아지가 냠냠 먹습니다.";
    }
}


public class Main {
       public static void main(String[] args) {
           Animal dog = new Dog();
           dog.eat();

       }
}
