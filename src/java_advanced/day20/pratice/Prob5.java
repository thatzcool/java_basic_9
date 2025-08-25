package java_advanced.day20.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/byte_output.txt");
        int data;
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }
        is.close();
    }
}
