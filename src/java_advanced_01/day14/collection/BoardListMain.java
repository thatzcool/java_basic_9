package java_advanced_01.day14.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {

    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        //글 하나를 작성하여 게시판에 올립니다.
        boardList.add(new Board("컬렉션 학습 첫째날11","쉽지 않아요...1","sym1"));
        boardList.add(new Board("컬렉션 학습 첫째날22","쉽지 않아요...2","sym2"));
        boardList.add(new Board("컬렉션 학습 첫째날33","쉽지 않아요...3","sym3"));
        boardList.add(new Board("컬렉션 학습 첫째날44","쉽지 않아요...4","sym4"));

        //현재 게시판의 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 :" + size);

        for (Board board : boardList) {
            System.out.print("제목:" + board.getSubject());
            System.out.print(" 내용:" + board.getContent());
            System.out.print(" 작성자:" + board.getWriter());
            System.out.println();
            System.out.println("----------------------------");
        }

        //특정 인덱스의 객체 가져오기
        Board board = boardList.get(2);
        System.out.print("제목:" + board.getSubject());
        System.out.print(" 내용:" + board.getContent());
        System.out.print(" 작성자:" + board.getWriter());
        System.out.println();

        System.out.println("=========삭제==========");
        boardList.remove(2);
        Board board1 = boardList.get(2);
        System.out.print("제목:" + board1.getSubject());
    }
}
