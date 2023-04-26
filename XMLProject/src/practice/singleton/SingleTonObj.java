package practice.singleton;

public class SingleTonObj {

    private static SingleTonObj sing = null;

    public SingleTonObj() {
        System.out.println("SingleTonObj가 새로 생성되었습니다.");
    }

    public static SingleTonObj getInstance() {
        if (sing == null) {
            sing = new SingleTonObj();
        }
        return sing;
    }

    public String getName() {
        return "싱글톤객체";
    }
}
