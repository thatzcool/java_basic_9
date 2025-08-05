package javabasic_02.day10.moringtest;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 100000;
    private String accountNo;   //계좌번호
    private String owner;       //소유자
    private int balance;   //통장 (입출금 내역 및 잔고확인)


    public String getAccountNo() {
        return accountNo;
    }


    public String getOwner() {
        return owner;
    }

    Account(){}
    //은행에 가서 계좌개설신청하면 개인정보를 은행에 등록하는 첫과정
    Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }


    public void setBalance(int money) {

        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            return;
        }
        this.balance += money;
    }


    public int getBalance() {

        return this.balance;
    }


}
