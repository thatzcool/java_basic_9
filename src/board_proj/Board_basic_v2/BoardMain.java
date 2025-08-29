package board_proj.Board_basic_v2;

public class BoardMain {
    public static void main(String[] args) {
        /*
            BoardExample 객체를 생성하고 list() 메서드 호출, list() 메서드는 게시물 목록을 출력, mainMenu() 호출

         */
        BoardManager boardManager = new BoardManager();
        BoardDAO board = new BoardDAO(boardManager);
        board.run();


    }

}
