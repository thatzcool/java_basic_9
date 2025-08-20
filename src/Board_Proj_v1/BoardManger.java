package Board_Proj_v1;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManger {
    private Map<String,Board> boardMap = new LinkedHashMap<>();


    //Singletone pattern 을 적용하여 어드민계정은 하나이다. 어드민 계정은 게시글 저장소를 관리한다.
    private static BoardManger boardMangerSingleton = new BoardManger();

    public static BoardManger getInstance() {
        return boardMangerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

    public static BoardManger getBoardMangerSingleton() {
        return boardMangerSingleton;
    }

    public static void setBoardMangerSingleton(BoardManger boardMangerSingleton) {
        BoardManger.boardMangerSingleton = boardMangerSingleton;
    }
}
