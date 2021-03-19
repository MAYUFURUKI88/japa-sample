package Sample11;

public class Worker extends Student {
	public Worker() {
		super();
		occupation = "デフォルト名前";
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void work() {
		System.out.println("仕事をする");

	}

}
