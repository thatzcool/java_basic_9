package board_proj.Board_basic_v2.exception;

import board_proj.Board_basic_v2.common.ErrorCode;

/*
    사용자 정의 Board 예외
 */
public class BoardException extends RuntimeException{
    private final ErrorCode error;

    public BoardException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
