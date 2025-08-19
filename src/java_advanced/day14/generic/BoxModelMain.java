package java_advanced.day14.generic;

public class BoxModelMain {

    public static void main(String[] args) {
        // 철호가 "배추", "무", "상추", "삼겹살" 구매하였다 물품을 담아서 box에 담고
        // box 담긴 내용을 출력하세요
           BoxModel<String> box = new BoxModel<String>();
          //BoxModel<String> box = new BoxModel<>();
          box.content = new String[]{"배추", "무", "상추", "삼겹살"};







    }
}
