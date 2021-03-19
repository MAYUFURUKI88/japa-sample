package Sample17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Main main = new Main();
		
		
		
		main.proc(new Sub1());
		Date date = main.stringToDate("2018/12/03");
		System.out.println(sdf.format(date));
		
		main.proc(new Sub2());
		Date date2 = main.stringToDate("aaaa/bb/cc");
		System.out.println(date2);
	}

	public void proc(MainAbstract subs) {

		subs.outStartLog();
		subs.proc();
		subs.outEndLog();
	}

	public Date stringToDate(String yyyyMMdd) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = sdf.parse(yyyyMMdd);
		} catch (ParseException e) {

		} finally {
			return date;
		}

	}

}
