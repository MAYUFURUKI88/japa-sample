package fukusyuu11;

public class Human {

	public void eat() {
		System.out.println("食べる");
	}

	public void sleep() {
		System.out.println("寝る");

	}

	String name;
	Integer age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


}
