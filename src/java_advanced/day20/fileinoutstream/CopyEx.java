package java_advanced.day20.fileinoutstream;

import java.io.*;

//파일 복사 기능 : FileInputStream 읽은 바이트를 바로 FileOutStream으로 출력기능
public class CopyEx {
    public static void main(String[] args)throws IOException {
        String originalFileName = "C:/Temp/test.jpg";
        String newFileName = "C:/Temp/testCopy_1.jpg";

        // InputStream , OutputStream 객체 생성 => 파일을 대상으로 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);
/*
        //이미지 객체의 데이터를 바이트 읽는다.
        byte[] buffer = new byte[1024]; // 읽은 바이트 수만큼 저장할 저장소 생성
        while(true){
           int numRead = is.read(buffer);
           if(is.read(buffer) != -1) break;
           os.write(buffer, 0, numRead);
        }*/
        //java9 부터 입력스트림에서 출력스트림으로 바이트를 복사하는 메소드 제공 transferTo()
        is.transferTo(os);

        //내부 비우기
          os.flush();
        //스트림 닫기
          os.close();
          is.close();
        System.out.println(newFileName + " 복사 완료");
    }
}
