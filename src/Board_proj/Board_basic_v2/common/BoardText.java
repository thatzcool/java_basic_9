package Board_proj.Board_basic_v2.common;

public enum BoardText {
    HEADER("\n[게시물 목록]"),
    BORDER_LINE("-".repeat(60)),
    //임시
    //BOARD_TITLE("%-4s %-20s %-20s %-20s\n","no", "writer", "date", "title");
    MAIN_MENU("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit"),
    MENU_SELECT("메뉴 선택: "),
    CREATE("\n[새 게시물 입력]"),

    UPDATE("\n수정 내용 입력"),
    READ("\n[게시물 읽기]"),
    EXIT("\n게시판 종료"),
    READ_NUMBER("bno: "),
    BNO("번호: "),
    TITLE("제목: "),
    BOARD("내용: "),
    WRITER("작성자: "),
    DATE("날짜: "),
    READ_LINE("#".repeat(30)),
    CHECK_MENU("보조 메뉴: 1.OK | 2. Cancel"),

    READ_CHECK_MENU("보조 메뉴: 1.Update | 2. Delete | 3.List");

    private final String text;

    BoardText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
