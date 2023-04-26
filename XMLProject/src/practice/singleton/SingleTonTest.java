package practice.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        new SingleTonTest().execute();
    }

    private void execute() {
        case1();
        case2();
    }

    private void case1() {
        System.out.println(SingleTonObj.getInstance().getName());
    }

    private void case2() {
        System.out.println(SingleTonObj.getInstance().getName());
    }
}
