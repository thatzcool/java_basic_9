package javabasic_02.day10.moringtest;

import java.util.Scanner;

public class BankApplication {
    static Scanner  in = new Scanner(System.in);

    //1. 계좌생성 기능  - private static void createAccount()
    private static void createAccount(){
        System.out.println("-------------");
        System.out.println("    계좌생성   ");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        String accountNo = in.nextLine();
        System.out.print("계좌주: ");
        String owner = in.nextLine();
        System.out.print("초기입금액: ");   //계산을 위한 정수로 형변환
        int balance = Integer.parseInt(in.nextLine());
        //새로운 계좌 생성
        Account newAccount = new Account(accountNo,owner,balance);
        System.out.println("결과: 계좌가 생성되었습니다.");

            }
    //2. 계좌목록 보기 기능 - private static void accountList()

    //3. 예금 기능  - private static void deposit()

    //4. 출금  기능-  private static void withdraw()

    //5. 프로그램 종료 기능    - private static void exitApp()

    //Bank applcaion 시작  - main()

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            String menu = """
                    ===========================================
                       1.계좌생성 2.계좌목록 3.예금  4.출금  5.입금
                    ===========================================
                    """;
            System.out.println(menu);
            System.out.print("<선택> ");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1 -> createAccount();
                case 2 -> createAccount();
                case 3 -> createAccount();
                case 4 -> createAccount();
                case 5 -> createAccount();

            }
            System.out.println("프로그램 종료합니다.");
        }


    }

}
