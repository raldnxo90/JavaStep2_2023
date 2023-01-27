package chapter17.arraylist;

public class Person {

	// 한사람의 정보 정의
	private String name;
	private int age;
	private String tel;

	public Person() {

	}

	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "회원정보 [이름=" + name + ", 나이=" + age + ", 전화번호=" + tel + "]";
	}

}
