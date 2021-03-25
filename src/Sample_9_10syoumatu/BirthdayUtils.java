package Sample_9_10syoumatu;

import java.util.Calendar;
import java.util.Date;

public class BirthdayUtils {

	/**
	 * 引数のdateから、年齢を返すメソッド
	 *
	 * @param date
	 * @return
	 */
	public static int getage(Date date2) {

		Date date1 = Calendar.getInstance().getTime();

		long date1long = date1.getTime();
		long date2long = date2.getTime();

		long i = date1long - date2long;

		System.out.println(i);

		double result = i / 1000 / 60 / 60 / 24 / 365;

		return (int) result;

	}

}
