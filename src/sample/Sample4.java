package sample;

public class Sample4 {

	public static void main(String[] args) {

		if (MyUtils.noneArgs(args)) {
			System.out.println("引数が指定されていません。");
			System.exit(0);
		}

		if (MyUtils.isEquals(args[0], "A")) {
			System.out.println("引数はAです。");
			
		} else if (MyUtils.isEquals(args[0], "B")) {
			System.out.println("引数はBです。");
			
		} else if (MyUtils.isEquals(args[0],  "C")) {
			System.out.println("引数はCです");
			
		} else {
			System.out.println("引数は[A,B,C]のいずれでもありません。");
		}

	}

	

}