package java_advanced.day20.pratice;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/test.jpg");
        OutputStream os = new FileOutputStream("C:/Temp/copy.jpg");

        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }

        is.close();
        os.flush();
        os.close();
        System.out.println("이미지 복사 완료!");
    }
}
