package JSON.kopo11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONMain2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser kopo11_parser = new JSONParser();

        Object kopo11_obj = kopo11_parser.parse(new FileReader(
                "C:\\Users\\changyoung.shin\\Desktop\\폴리텍 자료\\Practice_Project\\XMLProject\\resource\\jsontest.json"));

        JSONArray kopo11_array = (JSONArray) kopo11_obj;

        System.out.println("********************************");
        for (int kopo11_i = 0; kopo11_i < kopo11_array.size(); kopo11_i++) {
            JSONObject kopo11_result = (JSONObject) kopo11_array.get(kopo11_i);
            System.out.println("이름 : " + kopo11_result.get("name"));
            System.out.println("학번 : " + kopo11_result.get("studentid"));

            JSONArray kopo11_score = (JSONArray) kopo11_result.get("score");
            long kopo11_kor = (long) kopo11_score.get(0);
            long kopo11_eng = (long) kopo11_score.get(1);
            long kopo11_mat = (long) kopo11_score.get(2);
            System.out.println("국어 : " + kopo11_kor);
            System.out.println("영어 : " + kopo11_eng);
            System.out.println("수학 : " + kopo11_mat);
            System.out.println("총점 : " + (kopo11_kor + kopo11_eng + kopo11_mat));
            System.out.println("평균 : " + ((kopo11_kor + kopo11_eng + kopo11_mat) / 3.0));
            System.out.println("********************************");
        }
    }
}
