package java_advanced.day20.datainoutstream;

import java.io.*;

public class DataInputOutputEx {

    public static void main(String[] args) throws Exception {
        //데이터입출력객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("서유미");
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();


        //DataInputStream 객체
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive.db");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 1; i++) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double price = dis.readDouble();
            boolean flag = dis.readBoolean();
            System.out.println(name + " " + age + " " + price + " " + flag);
        }
        dis.close();
        fis.close();
    }
}
