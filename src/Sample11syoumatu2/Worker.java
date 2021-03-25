package Sample11syoumatu2;

public class Worker extends Human {

	public void work() {
		System.out.println("仕事をする");
	}

	public Worker(String name, Integer age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;

	}

	String occupation;

	public String getOccupation() {
		return occupation;
	}

}
