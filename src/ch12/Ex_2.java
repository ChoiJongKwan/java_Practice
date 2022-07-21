package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바킹", 1, 2));
		list.add(new Student("콩자반", 2, 1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name+", "+s.ban+"반, 번호: "+s.no);
				
		}
	}

}

class Student {
	String name;
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
}