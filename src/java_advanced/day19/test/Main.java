package java_advanced.day19.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;


class Person{
    private Phone phoneNumber;  //객체 생성시 초기화 null
    private String name;    //"홍길동"

    Person(String name){ this.name=name;    }

    public Phone getPhone() {
        return this.phoneNumber;}
}


class Phone{
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS(){
        return "IOS";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        //  person.getPhone().getOs().printOS();   //null.getOS()

        Person p = new Person("David");
        Phone ph = p.getPhone();
        //Null Object Pattern
        if (ph != null) {
            OS os = ph.getOs();
            if (os == null) {
                String osName = System.getProperty("os.name").toLowerCase();
            }
        }


    //Optional 클래스 NPE 처리 => Null 을 처리하기 위한 랩퍼(Wrapper)클래스

    Person p1 = new Person("서유미");

    Optional.ofNullable(p1).

    map(Person::getPhone).

    map(Phone::getOs). map(OS::printOS);

}



}

//왜 NPE 발생한 이유 ?
