package JSON.kopo11;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONMain {

    public static JSONObject oneRec(String kopo11_name, int kopo11_studentid, int kopo11_kor, int kopo11_eng,
            int kopo11_mat) {
        JSONObject kopo11_dataObject = new JSONObject(); // JSONObject 객체 생성
        kopo11_dataObject.put("name", kopo11_name); // 객체 name key에 값 입력
        kopo11_dataObject.put("studentid", kopo11_studentid); // 객체 studentid key에 값 입력

        JSONArray kopo11_score = new JSONArray(); // JSONArray 객체 생성
        kopo11_score.add(kopo11_kor); // kopo11_score에 값 추가
        kopo11_score.add(kopo11_eng); // kopo11_score에 값 추가
        kopo11_score.add(kopo11_mat); // kopo11_score에 값 추가
        kopo11_dataObject.put("score", kopo11_score); // 객체 score key에 값 입력

        return kopo11_dataObject; // 리턴
    }

    public static void main(String[] args) {
//		JSONObject kopo11_jsonObject = new JSONObject(); // JSONObject 객체 생성

        JSONArray kopo11_datasArray = new JSONArray(); // JSONArray 객체 생성

        JSONObject kopo11_dataObject = new JSONObject(); // JSONObject 객체 생성

        kopo11_dataObject.put("name", "나연"); // 객체 name key에 값 입력
        kopo11_dataObject.put("studentid", 209901); // 객체 studentid key에 값 입력

        JSONArray kopo11_score = new JSONArray(); // JSONArray 객체 생성
        kopo11_score.add(90); // kopo11_score에 값 추가
        kopo11_score.add(100); // kopo11_score에 값 추가
        kopo11_score.add(95); // kopo11_score에 값 추가
        kopo11_dataObject.put("score", kopo11_score); // 객체 score key에 값 입력
        kopo11_datasArray.add(kopo11_dataObject); // kopo11_datasArray에 값 추가

//        kopo11_datasArray.add(oneRec("나연", 209901, 90, 100, 95)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("정연", 209902, 100, 85, 75)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("모모", 209903, 90, 75, 85)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("사나", 209904, 90, 85, 75)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("지효", 209905, 80, 75, 85)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("미나", 209906, 90, 85, 55)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("다연", 209907, 70, 75, 65)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("채영", 209908, 100, 75, 95)); // kopo11_datasArray에 값 추가
        kopo11_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95)); // kopo11_datasArray에 값 추가

        try {
            // BufferedWriter로 쓰게될 입력값을 "UTF-8"로 맞춰주는 객체 생성
//            BufferedWriter kopo11_file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
//                    "C:\\Users\\changyoung.shin\\Desktop\\폴리텍 자료\\Practice_Project\\XMLProject\\resource\\jsontest.json"),
//                    "UTF-8"));
            // FileWriter는 다른곳에서 파일을 read할 때 한글이 깨지는 현상이 발생함.
            // 절대경로
//            FileWriter kopo11_file = new FileWriter(
//                    "C:\\Users\\changyoung.shin\\Desktop\\폴리텍 자료\\Practice_Project\\XMLProject\\resource\\jsontest.json");
            // 상대경로
            FileWriter kopo11_file = new FileWriter("resource/jsontest.json");
            kopo11_file.write(kopo11_datasArray.toJSONString()); // kopo11_file에 kopo11_datasArray.toJSONString 값 입력
            kopo11_file.flush(); // 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
            kopo11_file.close(); // BufferedWriter 종료
        } catch (IOException e) { // 오류 발생 시 catch
            e.printStackTrace();
        }
        System.out.println("JSON 만든거 : " + kopo11_datasArray); // 값 출력 개행
    }
}
