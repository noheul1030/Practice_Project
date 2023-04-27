package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class LocaleTest {

    public static final String LANGUAGE_KO = "ko";
    public static final String LANGUAGE_EN = "en";

    public static void main(String[] args) throws IOException {
        LocaleTest test = new LocaleTest();
        test.execute2();
    }

    private void execute2() {
        System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.KOREAN);
        if (Locale.getDefault() == Locale.KOREAN) {
            System.out.println("111 Locale.KOREAN");
        } else {
            System.out.println("111 Locale.KOREAN NOT!!!!");
        }

        if (Locale.getDefault().equals(Locale.KOREAN)) {
            System.out.println("222 Locale.KOREAN");
        } else {
            System.out.println("222 Locale.KOREAN NOT!!!!");
        }

        Locale.setDefault(Locale.US);
        if (Locale.getDefault() == Locale.US) {
            System.out.println("111 Locale.US");
        } else {
            System.out.println("111 Locale.US NOT!!!!");
        }

        if (Locale.getDefault().equals(Locale.US)) {
            System.out.println("222 Locale.US");
        } else {
            System.out.println("222 Locale.US NOT!!!!");
        }

//        Locale.setDefault(Locale.US);
//        System.out.println(Locale.getDefault());
//        System.out.println(Locale.getDefault().getLanguage());
//        System.out.println(Locale.getDefault().getCountry());
    }

    private void execute() throws IOException {
        System.out.println(Locale.getDefault());
        System.out.println(Locale.getDefault().getLanguage());
        System.out.println(Locale.getDefault().getCountry());
//        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());
        System.out.println(Locale.getDefault().getLanguage());
        System.out.println(Locale.getDefault().getCountry());
        if (LANGUAGE_KO.equals(Locale.getDefault().getLanguage())) {
            System.out.println("안녕하세요");
        } else {
            System.out.println("Hello");
        }

        FileWriter file = null;
        int count = 1;
        String str = "";
        try {
            for (int i = 0; i < count; i++) {
                file = new FileWriter("");
                file.write(str);
                file.flush();
            }
        } catch (IOException e) {
            // 오류발생시 추가로직 수행
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (file != null)
                try {
                    file.close();
                } catch (IOException e) {
                }
        }

        getException(0);

    }

    public void getException(int i) {
        if (i != 0) {
            throw new RuntimeException("입력값이 0이 아닙니다.");
//            throw new Exception();
        }
    }
}
