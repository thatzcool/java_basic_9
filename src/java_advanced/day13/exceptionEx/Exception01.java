package java_advanced.day13.exceptionEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//컴파일 예외 클래스 종류와 처리
// 1. IOException  : 입(Input)출력(Output)을 다루는 메소드는 IOException 처리하도록
// 2. FileNotFoundException : 파일에 접근하려고 하는데 지정 위치에 해당 파일이 없다.
public class Exception01 {
    public static void main(String[] args) {
            byte[]  list = {'a','b','c'};
//        try {
//            System.out.write(list);
//        } catch (IOException e) {
//            e.getMessage();
//        }
        //System.out.write(list);

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));

       } catch (FileNotFoundException e) {
           e.getMessage();
       }


    }


}

//예외 처리
//1. try-catch
//2. throws 던져서