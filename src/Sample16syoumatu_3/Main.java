package Sample16syoumatu_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class Main {

	public static void main(String[] args) {

		// getPersonListFromFile呼び出し

		Main main = new Main();
		List<Person> li = main.getPersonListFromFile("16-last-03.csv");

		// outputResult呼び出し

		main.outputResult(li);

		//writeStrToFile呼び出し
		main.writeStrToFile(li);

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
					p.setAge(Integer.parseInt(strs[1]));
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
	//	private String[] separateStrByKannma(String str) {
	//
	//
	//
	//	}

	/**
	 * 引数のリストを標準出力へ表示する
	 *
	 * @param list
	 */
	private void outputResult(List<Person> list) {

		for (int i = 0; i < list.size(); i++) {

			Person p = list.get(i);

			String name = p.getName();
			Integer age = p.getAge();

			String line = "name" + name + " age" + age;

			System.out.println(line);
		}
	}

	private void outputResult2(List<Person> list) {

		for (Person p : list) {

			System.out.println(p);
		}
	}

	private void outputResult3(List<Person> list) {

		list.forEach(System.out::println);
	}

	//Personリストをファイルに出力する
	private void writeStrToFile(List<Person> list) {
		try {
			FileWriter file = new FileWriter("16-last-04-out.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			for (Person p : list) {
				pw.println(p);
			}
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
