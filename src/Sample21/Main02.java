package Sample21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {

		Main02 main = new Main02();
		List<String> li = main.makeListFromFile("16-last-01.txt");
		main.listOutput(li);

	}

	public List<String> makeListFromFile(String path) {

		List<String> list = new ArrayList<>();

		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String str = br.readLine();

				if (str != null) {
					list.add(str);

				} else {
					break;
				}
			}

			return list;

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません。");
			return list;
		} catch (IOException e) {
			System.out.println("エラーです。");
			return list;

		}

	}

	public void listOutput(List<String> list) {

		for (String str : list) {
			System.out.println(str);
		}

	}

}
