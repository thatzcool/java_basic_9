package java_advanced.day21.pratice;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
@ToString
class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;  //직렬화 시 age필드 제외
}


public class Prob1 {
    public static void main(String[] args)  {

        Path path = Paths.get("person.dat");

        //직렬화 대상 객체 생성
        Person person = new Person("홍길동", 30);
        //try with resources ==> atuocloseable
     try( ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
             oos.writeObject(person);
        } catch (IOException e) {
            System.out.println("입출력예외 처리 완료");
        } catch (Exception e) {
            System.out.println("Exception 처리 완료");
        }

        //역직렬화

        try(ObjectInputStream ois =  new ObjectInputStream(Files.newInputStream(path))){
              Person p = (Person) ois.readObject();
              System.out.println(p.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
