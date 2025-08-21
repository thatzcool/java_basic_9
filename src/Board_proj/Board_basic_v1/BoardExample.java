package Board_proj.Board_basic_v1;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class BoardExample {
    static Scanner input = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int size = 1;

    BoardManager boardManager;

    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    /*
        게시물 목록 출력, mainMenu 메서드 출력
     */

    public void run() {
        while (true) {
            list();
            Scanner input = new Scanner(System.in);
            String inputNumber = input.nextLine();
            if (inputNumber.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (inputNumber.matches(menuNumberRegex)) {
                switch (inputNumber) {
                    case "1": create(); break;
                    case "2": read(); break;
                    case "3": clear(); break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하세요.");
            }
        }
    }

    /*
        checkMenu(): 보조 메뉴 확인 선택 메서드
     */
    public boolean checkMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.OK | 2. Cancel");
        System.out.print("메뉴 선택: ");
        while (true) {
            String inputNumber = input.nextLine();
            if (inputNumber.matches(checkNumber)) {
                return inputNumber.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요.");
            }
        }
    }
    /*
        create(): 게시물 생성 메서드
        사용자에게 제목, 내용, 작성자 입력 받고 Board 객체로 만들어 map에 입력
     */
    public void create() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        String title = input.nextLine();
        System.out.print("내용: ");
        String content = input.nextLine();
        System.out.print("작성자: ");
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
        read(): 게시물 읽기 메소드
     */
    public void read() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("[게시물 읽기]");
        int numberInput = 0;
        while (true) {
            try {
                System.out.print("bno: ");
                numberInput = input.nextInt();
                if (numberInput < 0 || numberInput > boardManager.getBoardSize()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board board = boardMap.get(String.valueOf(numberInput));
                    System.out.println("번호: "+ board.getBno());
                    System.out.println("제목: "+ board.getTitle());
                    System.out.println("내용: " + board.getContent());
                    System.out.println("작성자: "+ board.getWriter());
                    System.out.println("날짜: "+ dateFormat.format(board.getDate()));
                    System.out.println("-".repeat(30));
                    readOption(numberInput);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }


        }

    }

    /*
        readOption(): 읽기 메서드의 옵션 메서드
     */
    public void readOption(int bno) {
        Scanner input = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.Update | 2. Delete | 3.List");
        System.out.print("메뉴 선택: ");
        while(true) {
            String numberInput = input.nextLine();
            if(numberInput.matches(readOptionRegex)) {
                switch (numberInput) {
                    case "1": update(bno);break;
                    case "2": delete(bno);break;
                    case "3": run();break;
                }
                break;
            } else {
                System.out.println("[1-3]번 중 번호를 선택하세요.");
            }
        }
    }

    /*
        read의 옵션 update
     */
    public void update(int bno) {
        Scanner input = new Scanner(System.in);
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println();
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String title = input.nextLine();
        System.out.print("내용: ");
        String content = input.nextLine();
        System.out.print("작성자: ");
        String writer = input.nextLine();
        System.out.println("-".repeat(30));

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
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        //System.out.println("no\twriter\tdate\ttitle");
        System.out.printf("%-4s %-20s %-20s %-20s\n","no", "writer", "date", "title");


        List<Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            //System.out.println(value.getBno() + "\t" + value.getWriter() + "\t" + dateFormat.format(value.getDate()) + "\t" + value.getTitle());
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getWriter(), dateFormat.format(value.getDate()), value.getTitle());
        });
        System.out.println("-".repeat(60));

        /*boardMap.forEach((key, value) -> {
            System.out.println(value.getBno() + value.getWriter() + " " + value.getDate() + " " + value.getTitle());

        });*/
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
    }
}
