package day08_상속2;
/*
 * [클래스간의 형변환]
 * 클래스간에는 형변환이 안되지만 상속관계에서는 형변환이 가능하다.
 * 부모클래스는 자식클래스를 참조할수있지만 자식에서 추가한 멤버는 참조할수없다.
 * 단 오버라이딩된 멤버는 참조할수있다
 * 자식클래스에서 부모클래스를 참조할수는 잇지만 이때는 강제형변환 해야한다
 * 
 */
class AA{
	protected int a;
	public AA(int a) {this.a=a;}
	public void print() {System.out.println("a: "+a);}
}
class BB extends AA{
	private int b;
	public BB(int a, int b) {
		super(a);
		this.b=b;
	}
	@Override
	public void print() {System.out.println("a: "+a+",b: "+b);}
	public int getSum() {return a+b;}
}
public class Test03_클래스간의형변환 {
	public static void main(String[] args) {
		
	}
}
