package fukusyuu11;

public class Student extends Human {

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;

	}

	public void study() {
		System.out.println("勉強をする");
	}

	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
