package java_advanced.day20.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {
    public static void main(String[] args)  {

        try {
            //1. 출력스트림 생성 C:Temp/test1.db에 1byte 데이터를 저장한다.
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            //2. 내보낼 데이터를 지정
            byte num1 = 10;
            byte num2 = 20;
            byte num3 = 30;

            //3. 데이터를 스트림에 보내서 해당 목적지에 쓴다. 1byte 씩 출력
            os.write(num1);
            os.write(num2);
            os.write(num3);

            //4. 스트림의 버퍼를 비운다. (내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움)
            os.flush();

            //5. 스트림을 닫는다.
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
