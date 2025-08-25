package java_advanced.day20.pratice;

import java.io.FileReader;
import java.io.IOException;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Temp/hello.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
