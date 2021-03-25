package Sample15syoumatu_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {

		List<String> list = new ArrayList<>();
		list.add("3");
		list.add("2");
		list.add("aaa");
		list.add("1");

		for (String str : list) {
			try {
				int suuji = Integer.parseInt(str);
				System.out.println(str + "はint型に変換できました");
			} catch (Exception e) {
				System.out.println(str + "はint型に変換できません");
				

			}
		}

		//		try {
		//			for (String str : list) {
		//				
		//				
		//				System.out.println(str + "はint型に変換できました");
		//				int suuji = Integer.parseInt(str);
		//
		//			}
		//		} catch (Exception e) {
		//			
		//			System.out.println("はint型に変換できません。");
		//			
		//
		//
		//		}
	}

}
