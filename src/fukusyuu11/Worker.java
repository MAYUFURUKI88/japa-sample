package fukusyuu11;

public class Worker extends Human {

	public void work() {
		System.out.println("仕事をする");
	}

	String Occupation;

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

}
