package Sample18;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Main main = new Main();

        // １つ目のリスト
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        main.method(list);

        // ２つ目のリスト
        List<String> list2 = new ArrayList<>();

        list2.add("10");
        list2.add("aaa");
        list2.add("30");
        list2.add("40");

        main.method(list2);
    }

    public void method(List<String> list) {

        Sub s = new Sub();
        s.Method1(list);
    }

}
