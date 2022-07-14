package Ch09;
class Person{
	long id;
	public boolean IDequals(Object obj) {
		if(obj instanceof Person)
			return id== ((Person)obj).id;
		else {
			return false;
		}
		
	}
	Person(long id){
		this.id=id;
	}
}

public class Ex_2 {
	public static void main(String[] args) {
		Person p1= new Person(1111112222222L);
		Person p2= new Person(1111112222222L);
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 변수주소가 같습니다");
		}else {
			System.out.println("p1과 p2는 변수주소가 다릅니다");
		}
		
		if(p1.IDequals(p2)) {
			System.out.println("p1과 p2는 같은사람입니다");
		}else {
			System.out.println("p1과 p2는 다른사람입니다");
		}
	}

}
