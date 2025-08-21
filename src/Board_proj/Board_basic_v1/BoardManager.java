package Board_proj.Board_basic_v1;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private Map<String, Board> boardMap = new LinkedHashMap<>();

    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance(){ // 싱글톤 패턴 getInstance
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

    public int getBoardSize() {
        return boardMap.size();
    }

}
