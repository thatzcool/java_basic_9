package java_advanced.day21.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

//JSON 에서 속성 순서는 중요하지 않아 추가한 순서대로 작성하지 않아도 상관없습니다.
// 그리고 줄바꿈 처리도 되지 않습니다.  네트워크의 전송량을 줄여주어 오히려 이 점이 장점이 되었다.
//.json 파일을 파싱하는 방법을 실습하겠습니다.
public class ParseJsonEx {
    public static void main(String[] args) {
        // 파일로부터 JSON 읽어오기
    try(BufferedReader bufferedReader = new BufferedReader(new FileReader("sym.json", Charset.forName("UTF-8")))) {
                String json = bufferedReader.readLine();

                JSONObject root = new JSONObject(json);

                //속성정보 읽기
        System.out.println("아이디" + root.getString("name"));
        JSONObject obj = root.getJSONObject("tel");
        System.out.println("home-tel" + obj.getString("home"));
        System.out.println("mobile-tel" + obj.getString("mobile"));

        JSONArray skill = root.getJSONArray("skill");
        System.out.print("skill: ");
        for(int i=0; i<skill.length(); i++) {
            System.out.print(skill.get(i) + ", ");
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }



    }

}
