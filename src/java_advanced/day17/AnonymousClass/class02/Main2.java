package java_advanced.day17.AnonymousClass.class02;
class Animal{
    public String eat(){
        return "맛있게 먹습니다.";
    }
}



public class Main2 {
       public static void main(String[] args) {
         //익명클래스 : 클래스의 정의와 객체화를 동시 , 일회성 객체 사용
           Animal dog = new Animal(){
               @Override
               public String eat() {
                   return "강아지가 냠냠 먹습니다.";
               }
           };

       }
}
