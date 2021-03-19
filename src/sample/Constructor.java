package sample;

public class Constructor {

	public Constructor() {
		System.out.println("Called constructor");

	}
	
//	引数を渡せるコンストラクタ
	public Constructor(Integer num) {
		System.out.println("num is" + num);
	}

}
