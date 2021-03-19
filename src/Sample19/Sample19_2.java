package Sample19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample19_2 {

	public static void main(String args[]) {

        Sample19_2 main = new Sample19_2();

        File file = main.createFileInstance("write.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("ファイル作成中にエラーが発生しました。");
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);){

            bw.write("1234");
            bw.newLine();
            bw.flush();

            bw.write("asdf");
            bw.newLine();
            bw.flush();

            bw.write("zxcv");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    /**
    * 引数に与えられた文字列から、ファイルインスタンスを生成する。
    */
    private File createFileInstance(String filePath) {
        return new File(filePath);
    }
}