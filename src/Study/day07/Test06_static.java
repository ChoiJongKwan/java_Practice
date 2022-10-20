package day07;
/*
 * [static]
 * 1.static 메소드
 * 일반 멤버메소드는 객체를 생성한 후에 사용할수 있지만 static메소드는 <객체 생성없이 클래스명으로 호출>해서 사용한다.
 * 일반맴버변수(인스턴스변수)는 사용할수 없고 static맴버만 사용할수 있다
 * this를 사용할수 없다
 * 만드는방법: 메소드 리던형앞에 static를 붙여서 만든다
 * 인스턴스변수를 사용하지 않는 독립적인 작업의 메소드를 만들때  static 메소드를 만든다.
 */
class Math1{
	int a;
	int b;
	public int add(int x, int y) {
		return x+y;
	}
	public static int max(int x, int y) {
		return x>y?x:y;
	}
}
public class Test06_static {
	public static void main(String[] args) {
		Math1 m1 =new Math1();
		int a=m1.add(5, 3);
		System.out.println(a);
		int n=Math1.max(4, 8);
		System.out.println(n);
		
	}
}
