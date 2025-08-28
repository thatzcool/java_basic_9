package java_advanced.day21.pratice;
/*
문제 4
다음 요구사항을 만족하는 커스텀 직렬화를 구현하라.
Account 클래스는 owner(String)과 balance(int) 필드를 가진다.
단, balance는 transient로 선언한다.
writeObject()와 readObject()를 오버라이드하여 balance 값도 파일에 함께 저장하고 복원되도록 작성하라.
Account("철수", 10000)을 파일로 저장한 뒤 다시 읽어와 owner와 balance가 정상적으로 출력되는지 확인하라.
*/
import java.io.*;
import java.nio.file.*;
import java.util.*;

// 직렬화 대상
class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance; // 기본 직렬화 제외

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public String getOwner() { return owner; }
    public int getBalance() { return balance; }

    // 커스텀 직렬화: transient 필드 수동 저장/복원
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();   // owner 등 기본 필드 저장
        out.writeInt(balance);      // balance 별도로 기록
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();     // 기본 필드 복원
        this.balance = in.readInt();// balance 수동 복원
    }

    @Override
    public String toString() {
        return "Account{owner='" + owner + "', balance=" + balance + "}";
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Path listFile = Paths.get("account_list.dat");
        Path eachFile = Paths.get("account_each.dat");

        // 예제 데이터: 계정 2개
        List<Account> accounts = Arrays.asList(
                new Account("철수", 10000),
                new Account("영희", 25000)
        );

        // -------------------------------------------------
        // 1) 리스트 통째로 저장 & 읽기
        // -------------------------------------------------
        serializeList(listFile, accounts);
        System.out.println("=== 리스트 전체 저장 후 읽기 ===");
        List<Account> readList = deserializeList(listFile);
        for (Account a : readList) {
            System.out.println(a.getBalance() + a.getBalance());
        }
        System.out.println();

        // -------------------------------------------------
        // 2) 객체 하나씩 저장 & 읽기
        // -------------------------------------------------
        serializeOneByOne(eachFile, accounts);
        System.out.println("=== 객체 하나씩 저장 후 읽기 ===");
        deserializeOneByOne(eachFile);
    }

    // 리스트 통째 직렬화
    private static void serializeList(Path path, List<Account> accounts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(accounts);   // List<Account> 한 번에 저장
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 리스트 통째 역직렬화
    @SuppressWarnings("unchecked")
    private static List<Account> deserializeList(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return (List<Account>) ois.readObject(); // 통째로 읽어서 캐스팅
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    // 객체 하나씩 직렬화
    private static void serializeOneByOne(Path path, List<Account> accounts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            for (Account a : accounts) {
                oos.writeObject(a);     // Account 객체를 개별 저장
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 객체 하나씩 역직렬화 (EOFException으로 종료)
    private static void deserializeOneByOne(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            while (true) {
                try {
                    Account a = (Account) ois.readObject();
                    System.out.println(a);
                } catch (EOFException eof) {
                    System.out.println("모든 계정을 읽었습니다");
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
