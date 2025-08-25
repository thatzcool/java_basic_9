package java_advanced.day20.pratice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/byte_output.txt");
        String text = "ABCDEF";
        os.write(text.getBytes()); // 문자열 → 바이트 변환
        os.close();
        System.out.println("저장 완료!");
    }
}
