package Sample3_9syoumatu;

import java.util.Calendar;
import java.util.Date;

public class BirthdayUtils2 {

	public static int getage(Date birth) {

		Date date1 = Calendar.getInstance().getTime();

		long date1long = date1.getTime();
		long birth1long = birth.getTime();

		long i = date1long - birth1long;

		System.out.println(i);

		double result = i / 1000 / 60 / 60 / 24 / 365;

		return (int) result;

	}

}
