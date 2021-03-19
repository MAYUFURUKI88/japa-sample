package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class Main {

	public static void main(String[] args) {

		// getPersonListFromFile呼び出し

		// outputResult呼び出し

		Main main = new Main();
		List<Person> li = main.getPersonListFromFile("16-last-03.csv");
		main.outputResult();

	}

	/**
	 * ファイルを読み込み、Personクラスのリストを作成する
	 *
	 * @param path
	 * @return
	 */
	private List<Person> getPersonListFromFile(String path) {
		List<Person> list = new ArrayList<>();

		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String str = br.readLine();

				if (str != null) {

					//					String[] strs = str.split(",");
					//					Person p = new Person();
					//					p.setName(strs[0]);
					//					p.setAge(Integer.parseInt(strs[1]));
					//
					//					list.add(p);


					String[] strs = str.split(",");
					Person p = new Person();
					p.setName(strs[0]);
					p.setAge(Integer.parseInt (strs[1]));
					list.add(p);


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

	/**
	 * 引数の文字列を、カンマで分割した配列を返す。
	 *
	 * @param str
	 * @return
	 */
	private String[] separateStrByKannma(String str) {



	}

	/**
	 * 引数のリストを標準出力へ表示する
	 *
	 * @param list
	 */
	private void outputResult(List<Person> list) {
		sys

	}
}
