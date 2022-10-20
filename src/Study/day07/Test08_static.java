package day07;
/*
 * static 변수
 * 인스턴스변수는 객체의 수만큼 생성되지만 static 변수는 <객체의 생성수와는 상관없이 오로지 하나만생성>
 * 되어 모든 객체가 공유해서 사용한다.
 * 만드는방법 : 멤버변수 앞에 static를 붙여서 만든다
 * 인스턴스변수는 갤체를 new로생성하는 순간에 만들어 지지만 static맴버변수는 new로 생성하지 않아도 클래스가
 * 메모리에 로딩되는 순간에 생성된다
 */
class MyClass{
	private int a;
	private static int b;
	public MyClass() {
		a++;
		b++;
	}
	public void print() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	public static int getB() {
		return b;
	}
	
}

public class Test08_static {
	public static void main(String[] args) {
		MyClass ob1=new MyClass();
		ob1.print();
		MyClass ob2=new MyClass();
		ob2.print();
		MyClass ob3=new MyClass();
		ob3.print();
		System.out.println(ob3.getB());
	}
}
