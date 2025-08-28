package java_advanced.day21.pratice;

import java.io.Serializable;

/*
문제 2
아래 조건을 만족하는 Book 클래스를 작성하고, 여러 객체를 리스트로 만들어 한 번에 직렬화/역직렬화하라.
title(String), price(int) 필드를 가진다.
serialVersionUID를 명시적으로 선언한다.
main 메서드에서 ArrayList<Book>을 생성해 3권의 책 정보를 저장한 후, 파일(books.dat)로 저장하고 다시 읽어와 리스트 전체를 출력하라.*/
import java.io.*;
import java.nio.file.*;
import java.util.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price  = price;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', price=" + price + "}";
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Path listFile = Paths.get("books_list.dat");
        Path eachFile = Paths.get("books_each.dat");

        List<Book> books = Arrays.asList(
                new Book("이펙티브 자바", 38000),
                new Book("모던 자바 인 액션", 42000),
                new Book("클린 코드", 35000)
        );

        // -------------------------------------------------
        // 1) 리스트 통째로 저장 & 읽기
        // -------------------------------------------------
        serializeList(listFile, books);
        System.out.println("=== 리스트 전체 저장 후 읽기 ===");
        List<Book> readList = deserializeList(listFile);
        for (Book b : readList) {
            System.out.println(b);
        }
        System.out.println();

        // -------------------------------------------------
        // 2) 객체 하나씩 저장 & 읽기
        // -------------------------------------------------
        serializeOneByOne(eachFile, books);
        System.out.println("=== 객체 하나씩 저장 후 읽기 ===");
        deserializeOneByOne(eachFile);
    }

    // 리스트 통째 직렬화
    private static void serializeList(Path path, List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 리스트 통째 역직렬화
    @SuppressWarnings("unchecked")
    private static List<Book> deserializeList(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    // 객체 하나씩 직렬화
    private static void serializeOneByOne(Path path, List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            for (Book b : books) {
                oos.writeObject(b);
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
                    Book b = (Book) ois.readObject();
                    System.out.println(b);
                } catch (EOFException eof) {
                    System.out.println("모든 책을 읽었습니다 ");
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}