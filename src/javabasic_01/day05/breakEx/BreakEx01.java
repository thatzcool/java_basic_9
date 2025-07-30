package javabasic_01.day05.breakEx;

public class BreakEx01 {
    public static void main(String[] args) {
        while(true){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("게임 종료");
    }
}
