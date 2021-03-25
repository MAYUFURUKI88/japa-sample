package fukusyuu9;

import java.util.Calendar;
import java.util.Date;

public class BirthdayUtils {

	public static int ageResult(Date birth){

		Date now = Calendar.getInstance().getTime();

		long nowLong = now.getTime();
		long birthLong = birth.getTime();

		long i = nowLong - birthLong;

		double result = i/1000/365/24/60/60;
		return(int) result;


	}

}
