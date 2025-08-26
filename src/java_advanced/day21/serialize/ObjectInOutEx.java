package java_advanced.day21.serialize;
// 자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
// 객체를 입출력할 수 있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutStream (바이트 스트림과 연결되어 객체를 직렬화)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 100L;
    private String name;
    private transient int age;   //transient 키워드는 직렬화 대상에서 필드를 제외한다.
    public static int counter = 0;  // static 필드도 직렬화 대상에서 제외한다.
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    private static final long serialVersionUID = 100L;
    private String pname;
    private int price;
}
public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        //1.  C:/Temp/object.dat 에 파일객체에 파일입력스트림 객체를 생성해 주세요
        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        //2. 생성된 파일입력스트림 객체에 객체출력스트림 객체를 끼워(연결)주세요
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //3. 객체 생성
         User user = new User("신세계",20);
         Product product = new Product("삼성 노트북",1500000);
         int[] arr1 = {10,20,30};
         List<Product> products = Arrays.asList(product);

        //4. 위 4개의 객체를 object.dat 파일에 직렬화하여 저장
              oos.writeObject(products);
              oos.writeObject(arr1);
              oos.writeObject(product);
              oos.writeObject(user);
         //5.
          oos.flush();
          oos.close();
          fos.flush();
          fos.close();

      //파일에서 읽어서 객체를 복원시켜주세요. ObjectInputStream
       FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
       ObjectInputStream ois = new ObjectInputStream(fis);

       try{
           while(true){
               Object obj = ois.readObject();
               System.out.println(obj);
           }
       }catch(EOFException e){
           System.out.println("파일의 끝");
       }finally{
           ois.close();
           fis.close();
       }



    }

}
