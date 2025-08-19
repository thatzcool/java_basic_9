package java_advanced.day14.collection;

public class Board {
    private String subject;   //게시판에 올릴 글 제목
    private String content;   //내용
    private String writer;    //글쓴이

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }   // 게시판에 사용자가 입력한 게시물 하나 의미한다

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }


}
