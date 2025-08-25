package java_advanced.day20.pratice;

import java.io.File;
import java.io.IOException;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws IOException {
        File file = new File("copy.jpg");
        System.out.println("파일 크기: " + file.length() + " bytes");
    }
}
