package day08_상속;
class Person{
	private String snum;
	private String name;
	public Person() {
		System.out.println("person 생성자...");
	}
	public void setPerson(String snum, String name) {
		this.name=name;
		this.snum=snum;
	}
	public void printPerson() {
		System.out.println("주민등록번호: "+snum);
		System.out.println("이름: "+name);
	}
	
	
}
class Student extends Person{
	private int num;
	private String major;
	 public Student() {
		 System.out.println("student생성자");
	 }
	public void setStudent(int num,String major) {
		this.num=num;
		this.major=major;
	}
	public void printStudent() {
		
		System.out.println("학생번호: "+num);
		System.out.println("전공: "+major);
	}
	public void setAll(int num,String major,String snum, String name) {
		setPerson(snum,name);
		this.num=num;
		this.major=major;
	}
	public void printAll() {
		printPerson();
		System.out.println("학생번호: "+num);
		System.out.println("전공: "+major);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Student st= new Student();
		st.setPerson("11111-11111", "cjk");
		st.setStudent(1, "java");
		st.printPerson();
		st.printStudent();
		System.out.println();
		Student st2= new Student();
		st2.setAll(2, "java", "11111-11112", "son");
		st2.printAll();
	}
}
