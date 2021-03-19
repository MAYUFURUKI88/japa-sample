package Sample3;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main3 {

	public Main3() {
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1988, 0, 18);

		Emp emp1 = new Emp("Tanaka", cal.getTime());
		emp1.calcAge();

		Emp emp2 = new Emp("Kawabata", null);
		emp2.calcAge();

		System.out.println("名前："
				+ emp1.getName()
				+ "、生年月日："
				+ new SimpleDateFormat("yyyy/MM/dd").format(emp1.getBirthday())
				+ "、年齢：" + emp1.getAge());
		System.out.println("名前："
				+ emp2.getName()
				+ "、生年月日："
				+ emp2.getBirthday()
				+ "、年齢："
				+ emp2.getAge());

	}

}
