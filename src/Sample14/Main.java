package Sample14;

public class Main {

	 public static void main(String args[]) {

	        Main main = new Main();

	        main.out(new Tanaka());
	        main.out(new Kawabata());
	    }

	private void out(RapideEmp human) {
		human.syukin();
		human.work();
		human.taikin();

	}

}
