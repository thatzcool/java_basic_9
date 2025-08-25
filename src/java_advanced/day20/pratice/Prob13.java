package java_advanced.day20.pratice;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));

        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("Java");
        dos.writeBoolean(true);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        dis.close();
    }
}
