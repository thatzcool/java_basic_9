package java_advanced.day20.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args)throws Exception {

        Reader reader = null;

        // 1. 문자 하나씩 읽기
          reader = new FileReader("C:/Temp/testChar.txt");
          while(true){
              int data = reader.read();
              if(data  == -1) break;
              System.out.print((char)data + " ");
          }

          reader.close();
          System.out.println();

        // 2. 문자 배열로 읽기
        reader = new FileReader("C:/Temp/testChar.txt");
        char[] datas = new char[100];

        while(true){
            int numRead = reader.read(datas);
            if(numRead == -1) break;
            for (int i = 0; i < numRead ; i++) {
                System.out.print(datas[i]);
            }

        }
        reader.close();//꼭 사용한 스트림 닫기


    }
}
