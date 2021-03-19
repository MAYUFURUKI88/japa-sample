package model;

/**
 * 年齢と名前を格納するPersonモデル
 */
public class Person {

	// 名前はString
	// 年齢はIntegerのクラスでprivateなフィールドを作り
	// getter／setterを実装

	private String name;
	private Integer age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}