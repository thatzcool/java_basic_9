package java_advanced.day20.pratice;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args)throws IOException {

        //numbers.dat 파일에 정수데이터를 써야 하므로 FileOutputStream fos객체 생성
        FileOutputStream fos = new FileOutputStream("numbers.dat");
        //성능을 높이기 보조스트림 => DataOutStream() 사용해야지~
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);
        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("numbers.dat");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        dis.close();






    }
}
