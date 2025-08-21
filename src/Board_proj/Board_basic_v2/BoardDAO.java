package Board_proj.Board_basic_v2;

import Board_proj.Board_basic_v2.common.BoardText;
import Board_proj.Board_basic_v2.common.ValidCheck;
import Board_proj.Board_basic_v2.exception.BoardException;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class BoardDAO {
    private static ValidCheck validCheck = new ValidCheck();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static int size = 1;
    BoardManager boardManager;

    public BoardDAO(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    /*
        게시물 목록 출력, mainMenu 메서드 출력
     */
    public void run() {
        while (true) {
            list(); //게시물 출력 + 메인 메뉴 선택 문구
            Scanner input = new Scanner(System.in);
            String menuNum = input.nextLine();
            try {
                validCheck.isMenuValid(menuNum);
                switch (menuNum) {
                    case "1" -> create();
                    case "2" -> read();
                    case "3" -> clear();
                    case "4" -> exit();
                }
            } catch (BoardException e) {
                System.out.println(e.getMessage());
                run();
            }
        }
    }

    /*
        create(): 게시물 생성 메서드
        사용자에게 제목, 내용, 작성자 입력 받고 Board 객체로 만들어 map에 입력
     */
    public void create() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.CREATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = input.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = input.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = input.nextLine();
        //1번 입력하면
        if (checkMenu()) {
            Board board = Board.builder()
                    .bno(size)
                    .writer(writer)
                    .title(title)
                    .content(content)
                    .date(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(size), board);
            boardManager.setBoardMap(boardMap);
            size++;
        }
    }

    /*
        checkMenu(): 보조 메뉴 확인 선택 메서드
        - 1번 Create() 메서드의 (저장, 취소) 버튼
     */
    public boolean checkMenu() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.CHECK_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
        while (true) {
            String inputNumber = input.nextLine();
            validCheck.isCheckMenuValid(inputNumber);
            return inputNumber.equals("1"); //입력값이 1이면 true, 2이면 false
        }
    }

    private void exit() {

    }

    /*
        read(): 게시물 읽기 메소드
     */
    public void read() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.READ.getText());
        System.out.print(BoardText.READ_NUMBER.getText());
        String number = input.nextLine();
        validCheck.isValidBoardNumber(number, boardManager.getBoardSize());

        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.READ_LINE.getText());
        Board board = boardMap.get(number);

        System.out.println(BoardText.BNO.getText() + board.getBno());
        System.out.println(BoardText.TITLE.getText() + board.getTitle());
        System.out.println(BoardText.BOARD.getText() + board.getContent());
        System.out.println(BoardText.WRITER.getText() + board.getWriter());
        System.out.println(BoardText.DATE.getText() + dateFormat.format(board.getDate()));
        System.out.println(BoardText.READ_LINE.getText());
        readOption(Integer.parseInt(number));
    }

    /*
        readOption(): 읽기 메서드의 옵션 메서드
     */
    public void readOption(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.READ_CHECK_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
        String numberInput = input.nextLine();
        validCheck.isReadOptionMenuValid(numberInput);
        switch(numberInput) {
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> run();
        }
    }

    /*
        read의 옵션 update
     */
    public void update(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.UPDATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = input.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = input.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = input.nextLine();
        System.out.println(BoardText.BORDER_LINE.getText());

        Board board = Board.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .date(new Date())
                .build();

        if (checkMenu()) {
            boardMap.replace(String.valueOf(bno), board);
            boardMap.get(String.valueOf(bno)).setBno(bno);
            boardManager.setBoardMap(boardMap);
        }

    }

    /*
        read의 옵션 delete
     */
    public void delete(int bno) {
        int num = 1;
        size--;
        Map<String, Board> boardMap = boardManager.getBoardMap();
        Map<String, Board> newBoardMap = new LinkedHashMap<>();
        for (Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) {
                continue;
            } else if (Integer.parseInt(key) < bno) {
                newBoardMap.put(key, board);
                num++;
            } else {
                newBoardMap.put(String.valueOf(num), board);
                board.setBno(num);
                num++;
            }
        }
        boardManager.setBoardMap(newBoardMap);
    }

    /*
        게시판 내용 전체 삭제
     */
    public void clear() {
        boardManager.setBoardMap(new LinkedHashMap<>());
        size = 1;
    }

    /*
        게시물 출력
     */
    public void list() {
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.HEADER.getText());
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        List<Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            //System.out.println(value.getBno() + "\t" + value.getWriter() + "\t" + dateFormat.format(value.getDate()) + "\t" + value.getTitle());
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getWriter(), dateFormat.format(value.getDate()), value.getTitle());
        });
        System.out.println(BoardText.BORDER_LINE.getText());

        /*boardMap.forEach((key, value) -> {
            System.out.println(value.getBno() + value.getWriter() + " " + value.getDate() + " " + value.getTitle());

        });*/
        mainMenu();
    }

    public void mainMenu() {
        System.out.println(BoardText.MAIN_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
    }
}
