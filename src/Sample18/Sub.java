package Sample18;

import java.util.List;

public class Sub {
	public void Method1(List<String> list) {

        for (String s : list) {
        	try {
            int i = Integer.parseInt(s);
            System.out.println(i * 10);
        	}catch(Exception e) {
        		System.out.println(s + "はint型に変換できません");
        	}
        }
    }

}
