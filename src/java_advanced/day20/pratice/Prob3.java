package java_advanced.day20.pratice;

import java.io.FileReader;
import java.io.IOException;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Temp/hello.txt");
        int count = 0;
        while (fr.read() != -1) {
            count++;
        }
        fr.close();
        System.out.println("총 문자 수: " + count);
    }
}
