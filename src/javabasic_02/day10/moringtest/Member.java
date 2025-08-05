package javabasic_02.day10.moringtest;

public class Member {
      String name;
      String id;
      String password;
      int age;

      Member(){};
      Member(String name,String id){
          this.name = name;
          this.id = id;
      };

    public static void main(String[] args) {
        Member user1 = new Member();
        System.out.println(user1.toString());
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.id);
        System.out.println(user1.password);

        Member user2 = new Member("홍길동","hong");

        System.out.println(user2.toString());
        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.id);
        System.out.println(user2.password);

    }
}
