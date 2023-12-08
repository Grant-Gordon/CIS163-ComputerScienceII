package main;
public class Person {

	public Person(String name, int age, String gender, String email){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	private String name;
	private int age;
	private String gender;
	private String email;

	public int getAge() {
		return age;
	}
	
	public String getGender(){
		return gender;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public void printPerson() {
		System.out.println("("+name+", "+age+", "+gender+", "+email+")");
	}
}

