package Sample3_9syoumatu;

import java.util.Calendar;
import java.util.Date;

public class Emp {



	/**
	 * インスタンスの数を数えるempCountメソッド
	 *
	 * */
	private static int counter;

	public Emp() {
		counter++;
	}

	public static int empCount() {
		return counter;
	}



	public Emp(String asdf, Date birth) {
		this.name= asdf;
		this.birth = birth;
		counter++;

	}

	/** 名前 */
	private String name;

	/** 年齢 */
	private Integer age;

	/** 生年月日 */
	private Date birth;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return this.age;
	}
	public Date getBirthday() {
		return this.birth;
	}
	public void setBirthday(Date birth) {
		this.birth = birth;
	}

	public void  calcAge() {
		
		if(birth == null) {
			age = 0;
			return;
		}

		Date date1 = Calendar.getInstance().getTime();

		long date1long = date1.getTime();
		long birth1long = birth.getTime();

		long i = date1long - birth1long;

		System.out.println(i);

		double result = i / 1000 / 60 / 60 / 24 / 365;

		 age = (int)result;
	}

}
