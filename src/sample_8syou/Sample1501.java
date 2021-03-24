package sample_8syou;

public class Sample1501 {

    public static void main(String args[]) {

        Sample1501 main = new Sample1501();

        main.callReigai();
    }

    public void callReigai() {

        CheckedReigai instance = new CheckedReigai();

        // コンパイルエラーになる
        // instance.echoStr("test");

        try {
            instance.echoStr("test");
        } catch (Exception e) {
            // 発生しうる例外をキャッチしておく
            System.out.println("caused exception");
        }
    }
}

