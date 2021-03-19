package Sample21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main01 {

	public static void main(String[] args) {

		Main01 main = new Main01();

		//		File file = main.createFileInstance("16-last-01.txt");

		//		if (file == null || !file.exists()) {
		//			System.out.println("ファイルパスが正しくありません");
		//			System.exit(9);
		//		}

		main.readFile("16-last-01.txt");

	}

	private void readFile(String path) {
		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String str = br.readLine();

				if (str != null) {
					System.err.println(str);
				} else {
					break;
				}
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} finally {

		}
	}

	//	private File createFileInstance(String filePath) {
	//		return new File(filePath);
	//	}

}
