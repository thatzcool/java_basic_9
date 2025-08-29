package board_proj.Board_basic_v2.common;


import board_proj.Board_basic_v2.exception.BoardException;

public class ValidCheck {
    private static final String MENU_NUMBER = "^[1-4]$";
    private static final String CHECK_MENU_NUMBER = "^[1-2]$";
    private static final String CHECK_NUMBER = "^[0-9]*$";
    private static final String READ_OPTION_NUMBER = "^[1-3]$";

    //메인 메뉴 1-4번 유효 검사
    public void isMenuValid(String menu) {
        if(!(menu.matches(MENU_NUMBER))) {
            throw new BoardException(ErrorCode.INVALID_MENU_OPTION);
        }
    }

    // 1번 Create의 옵션 메뉴 1-2번 유효 검사
    public void isCheckMenuValid(String menu) {
        if(!(menu.matches(CHECK_MENU_NUMBER))) {
            throw new BoardException(ErrorCode.INVALID_CHECK_OPTION);
        }
    }

    // 2번 예외 처리
    public void isValidBoardNumber(String number, int boardSize) {
        // read 입력값이 숫자가 아닌 경우
        if(number.isEmpty()) {
            throw new BoardException(ErrorCode.INVALID_EMPTY);
        }

        if(!(number.matches(CHECK_NUMBER))) {
            throw new BoardException(ErrorCode.INVALID_CHECK_NUMBER);
        }
        //read 값이 게시판에 존재 X, 숫자 O
        int num = Integer.parseInt(number);
        if(num<1 || num > boardSize)
            throw new BoardException(ErrorCode.INVALID_BOARD_NUMBER);
    }

    // read 메서드의 옵션 입력 번호 예외 처리

    public void isReadOptionMenuValid(String number) {
        if(!number.matches(READ_OPTION_NUMBER)) {
            throw new BoardException(ErrorCode.INVALID_CHECK_READ_OPTION);
        }
    }




}
