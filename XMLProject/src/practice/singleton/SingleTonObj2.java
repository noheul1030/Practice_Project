package practice.singleton;

public class SingleTonObj2 {
    static SingleTonObj2 sing = new SingleTonObj2();

    public SingleTonObj2() {
        System.out.println("SingleTonObj22222가 새로 생성되었습니다.");
    }
}
