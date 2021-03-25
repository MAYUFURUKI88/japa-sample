package Sample11syoumatu2;

public class Main {

	public static void main(String args[]) {

		// Student
		Student s = new Student("Tanaka", 20, "大学生");
		s.eat();
		s.sleep();
		s.study();
		System.out.println("名前："
				+ s.getName()
				+ "、年齢："
				+ s.getAge()
				+ "、学年："
				+ s.getGrade());

		// Worker
		Worker w = new Worker("Tanaka", 30, "SE");
		w.eat();
		w.sleep();
		w.work();
		System.out.println("名前："
				+ w.getName()
				+ "、年齢："
				+ w.getAge()
				+ "、職業："
				+ w.getOccupation());
	}

}
