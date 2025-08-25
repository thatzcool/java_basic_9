package java_advanced.day20.pratice;

import java.io.FileWriter;
import java.io.IOException;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:/Temp/hello.txt");
        fw.write("Hello Java!");
        fw.flush();
        fw.close();
        System.out.println("저장 완료!");
    }
}
