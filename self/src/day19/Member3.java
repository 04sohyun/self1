package day19;

public class Member3 {
	private String name;
	private int age;
	public Member3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	//hash코드 비교
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3)
			return this.name.equals(((Member3)obj).getName())&&this.age==((Member3)obj).getAge();
	return false;
	}
}
