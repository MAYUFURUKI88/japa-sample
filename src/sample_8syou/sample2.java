package sample_8syou;

public class sample2 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int plus01 = plus(a,b);
		echo("a + b = " + plus01);
		
		b = 15;
		int plus02 = plus(a,b);
		echo("a + b = " + plus02);
		

	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	public static void echo(String s) {
		System.out.println(s);
	}

}
