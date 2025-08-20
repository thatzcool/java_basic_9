package Board_basic_v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/*
    게시판 DTO
 */

@Data
@Builder
@AllArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;
}
