package Ch07;

public class NEx_13 {
	class InstnaceInner{}
	static class Staticinner{}
	// 인스턴스 멤버간에는 서로 직접 접근이 가능하다.
	InstnaceInner iv = new InstnaceInner();
	//static 멤버간에는 서로 직접 접근이 가능하다.
	static Staticinner cv= new Staticinner();
	static void staticmethod() {
		//static멤버는 인스턴스멤버에 직접접근할수 없다
		//InstnaceInner obj1 = new InstnaceInner();
		Staticinner obj2= new Staticinner();
		
		//굳이 접근하려면 아래와같이 객체를 생성해야한다
		//인스턴스클래스는 외부 클래스를 먼저생성해만 생성할수있다.
		NEx_13 outer=new NEx_13();
		InstnaceInner obj1= outer.new InstnaceInner();
	}
	void instancemethod() {
		// 인스턴스메서드에서는 인스턴스 멤버와 스태틱맴버 모두 접근가능하다.
		InstnaceInner obj1 = new InstnaceInner();
		Staticinner obj2= new Staticinner();
		//매서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근할수없다
	//	localinner lv = new localinner();
	}
	
	void mymethod() {
		class localinner{}
		localinner lv = new localinner();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
