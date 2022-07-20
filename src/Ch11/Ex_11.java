package Ch11;

import java.util.HashSet;

public class Ex_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add("abc");
		set.add("abc");
		set.add(new Person("son",7));
		set.add(new Person("son",7));
		System.out.println(set);
		
	}

}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
}