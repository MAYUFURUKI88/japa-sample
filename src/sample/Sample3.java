package sample;

public class Sample3 {
	
	public static void main(String[] args) {
		
		int a = 4000;
		int b = 2500;
		int e = 13000;
		double c = 1.03;
		double d = 1.08;
		
		System.out.println("消費税率3％の場合、税抜き4000円の商品は税込み" + a * c +"円となる");
		System.out.println("消費税率3％の場合、税抜き2500円の商品は税込み" + b * c +"円となる");
		System.out.println("消費税率8％の場合、税抜き13000円の商品は税込み" + e * d +"円となる");
	}
	
	public static void taxIncluded() {
		
	}

}
