package Sample19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample_19 {
	public static void main(String args[]) {
		
		Sample_19 main = new Sample_19();
		
		File file = main.createFileInstance("read.txt");
		
		//fileインスタンスがnull、またはexist()メソッドがtrueでない場合
		if(file == null || !file.exists()) {
			System.out.println("ファイルパスが正しくありません。");
			System.exit(9);
		}
		//FileReaderインスタンスを生成
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
			
			//一行ずつ読み込む
			while(true) {
				String str = br.readLine();
				
				if(str != null) {
					
					System.out.println(str);
				}else {
					break;
				}
				
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			
		}
		
	}
	
	
		
		
		
		
		
	private File createFileInstance(String filePath) {
		return new File(filePath);
	}

}
