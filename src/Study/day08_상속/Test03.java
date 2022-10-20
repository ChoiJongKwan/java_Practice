package day08_상속;
/*
 * [ 상속에서의 생성자]
 * - 자식객체가 생성될때 부모생성자가 먼저 호출되고 자식생성자가 호출된다.
 * -부모생성자에 매개변수가 있다면 자식생성자에서 super()를 통해 부모생성자를 호출해야한다.
 */
class AA{
	private int a;
	public AA(int a) {
		this.a=a;
	}
	public int getA() {
		return a;
	}
}
class BB extends AA{
	private int b;
	public BB(int a, int b) {
		super(a);
		this.b=b;
		
	}
	int getB() {
		return b;
	}
	
}
public class Test03 {
	public static void main(String[] args) {
		AA a =new AA(7);
		System.out.println(a.getA());
		BB b= new BB(9, 5);
		System.out.println("a:"+b.getA());
		System.out.println("b:"+b.getB());
	}
}
