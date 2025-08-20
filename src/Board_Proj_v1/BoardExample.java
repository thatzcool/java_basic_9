package Board_Proj_v1;

import java.util.Scanner;

//사용자가 현재 게시물목록 읽을 수 있다.
//사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽을 수도 있고, 삭제할 수도 있다.
//사용자는 게시판을 프로그램을 종료할 수 있다.
public class BoardExample {


    // 현재 게시판의 전체 게시물 목록을 출력 기능
    public void list(){
        String boardList = """
                       [게시물 목록]
                       --------------------------------------------------------
                       no      writer      date      title 
                       --------------------------------------------------------
                        1      winter      2024.01.02  게시판에 오신것을 환영합니다.  
                        2      winter      2024.01.01  올 겨울은 매우 춥네요.....  
                           
                """;
        System.out.println(boardList);
        mainMenu();
    }

    //메인 메뉴
    public void mainMenu(){
        String mainMenu = """
                       --------------------------------------------------------
                       메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit 
                       --------------------------------------------------------
                       메뉴선택 :
                           
                """;
        System.out.println(mainMenu);
    }

    // 게시물 메인 메뉴 선택 기능
    public void run(){
        while(true){
            list();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();  //외부에서 사용자가 입력한 데이터타입은 모두 문자열

            if(input.equals("4")){
                System.out.println("\n게시판 종료");
                break;
            }
            if(input.matches(menuNumberRegex)){
                switch (input){
                    case "1":  System.out.println("*** create() 메소드 실행됨");
                    case "2":  System.out.println("*** read() 메소드 실행됨");
                    case "3":  System.out.println("*** clear() 메소드 실행됨");
                }
            }else {
                System.out.println("[1-4]번 번호를 입력하세요");
            }



        }







    }

}
