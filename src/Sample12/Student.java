package Sample12;

public class Student extends Human {

	public void study() {
		System.out.println("勉強をする");
	}

	public Student(String name, Integer age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;

	}

	String grade;


	public String getGrade() {
		return grade;
	}

}
