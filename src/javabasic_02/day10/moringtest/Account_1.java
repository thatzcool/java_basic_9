package javabasic_02.day10.moringtest;

public class Account_1 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 100000;
    private int balance;   //통장 (입출금 내역 및 잔고확인)


    public void setBalance(int money) {

        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            return;
        }
        this.balance += money;
    }


    public int getBalance() {

        return this.balance;
    }

    public static void main(String[] args) {
        Account_1 account = new Account_1();

        account.setBalance(10000);
        System.out.println(account.balance);

        account.setBalance(200);
        System.out.println(account.balance);

    }


}
