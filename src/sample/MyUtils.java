package sample;

public class MyUtils {

//		引数がnullまたは１つも要素がない場合にtrueを返す。
		public static boolean noneArgs(String args[]) {
			return args == null || args.length < 1;

		}
		
		public static boolean isEquals(String arg1, String arg2) {
			
			if(arg1 == null) {
				return false;
			}
			
			if(arg2 == null) {
				return false;
			}
			
			return arg1.equals(arg2);
		}


}
