package fukusyuu9;

import java.util.Calendar;

public class Syoumatu_9Main {

	public Syoumatu_9Main() {

	}

	public static void main(String[] args) {
		Emp emp = new Emp();

		Calendar cal = Calendar.getInstance();
		cal.set(1988,1,18);

		emp.name = "田中";
		emp.birth = cal.getTime();

		System.out.println(BirthdayUtils.ageResult(emp.birth));;
	}



}
