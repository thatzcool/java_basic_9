package Board_Proj_v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno;  //글번호
    private String bTitle;  // 글제목
    private String bContent; //글 내용
    private String bWriter;  //글쓴이
    private Date bDate;    //글쓴 날짜

}
