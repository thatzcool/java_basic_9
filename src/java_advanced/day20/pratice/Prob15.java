package java_advanced.day20.pratice;

import java.io.*;

//문제 : 학생 이름 "신세계" 나이 25 학점 3.8 을 student.dat파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob15 {
    public static void main(String[] args) {
        //신세계 학생 객체 생성
        Student student = Student.builder()
                .name("신세계")
                .age(25).score(3.8).build();

        String filename = "student.dat  ";
        //신세계 학생 student.dat 파일에 저장
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))){
            dos.writeUTF(student.getName());
            dos.writeInt(student.getAge());
            dos.writeDouble(student.getScore());
        } catch (Exception e) {
              e.printStackTrace();
        }

        //student.data로 부터 학생 정보 읽어와서 정보 출력
      try( DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
          String name = dis.readUTF();
          int age = dis.readInt();
          double score = dis.readDouble();

          System.out.println(name + " " + age + " " + score);
      } catch (Exception e) {
          e.printStackTrace();
      }


    }
}
