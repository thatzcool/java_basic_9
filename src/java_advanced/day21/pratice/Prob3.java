package java_advanced.day21.pratice;

/*
아래 조건을 만족하는 Student 클래스를 작성하라.
그리고 students.dat에 학생 객체 2개를 차례대로 직렬화한 후, 파일에서 하나씩 역직렬화하여 출력하라.
name(String), grade(int) 필드를 가진다.
Serializable을 구현한다.
*/

import java.io.*;
import java.nio.file.*;
import java.util.*;

// Student 클래스
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}

public class Prob3 {
    public static void main(String[] args) {
        Path listFile = Paths.get("students_list.dat");
        Path eachFile = Paths.get("students_each.dat");

        // 직렬화할 Student 객체 2개 준비
        List<Student> students = Arrays.asList(
                new Student("철수", 1),
                new Student("영희", 2)
        );

        // -------------------------------------------------
        // 1) 리스트 통째로 저장 & 읽기
        // -------------------------------------------------
        serializeList(listFile, students);
        System.out.println("=== 리스트 전체 저장 후 읽기 ===");
        List<Student> readList = deserializeList(listFile);
        for (Student s : readList) {
            System.out.println(s);
        }
        System.out.println();

        // -------------------------------------------------
        // 2) 객체 하나씩 저장 & 읽기
        // -------------------------------------------------
        serializeOneByOne(eachFile, students);
        System.out.println("=== 객체 하나씩 저장 후 읽기 ===");
        deserializeOneByOne(eachFile);
    }

    // 리스트 통째 직렬화
    private static void serializeList(Path path, List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 리스트 통째 역직렬화
    @SuppressWarnings("unchecked")
    private static List<Student> deserializeList(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    // 객체 하나씩 직렬화
    private static void serializeOneByOne(Path path, List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 객체 하나씩 역직렬화 (EOFException으로 끝 감지)
    private static void deserializeOneByOne(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    System.out.println(s);
                } catch (EOFException eof) {
                    System.out.println("모든 학생을 읽었습니다");
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

