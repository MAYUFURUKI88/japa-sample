package Sample11;

public class Student {

	public Student() {
		name = "デフォルト名前";
		age = 99;
		grade = "デフォルト名前";

	}

	public void eat() {
		System.out.println("食べる");

	}

	public void sleep() {
		System.out.println("寝る");

	}

	public void study() {
		System.out.println("勉強をする");

	}

	

	/** 名前 */
	String name;

	/** 年齢 */
	Integer age;

	/** 学年 */
	String grade;

	/** 職業 */
	String occupation;

	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

	public String getGrade() {
		return this.grade;
	}

	
}
