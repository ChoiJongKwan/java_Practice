package Ch07;
class Outer{
	private int outerIv =0;
	static int outerCv=0;
	
	class InstanceInner{
		int iiv = outerIv;// 외부클래스의 private맴버도 접근가능하다
		int iiv2 = outerCv;
	}
	static class StaticInner{
		//스태틱 클래스는 외부클래스의 인스턴스멤버에게 접근할수없다
		//int siv = outerIv;
		static int scv= outerCv;
	}
	void myMethod() {
		int lv=0;
		final int LV=0;  //JDK1.8부터 final생략가능
		class LocalInner{
			int liv= outerIv;
			int liv2= outerCv;
			// 외부클래스의 지역변수는 final이 붙은 변수만 접근가능하다
			int liv3=lv;// 에러!!!(JDK1.8 이상이면 에러아님)
			int liv4=LV;
		}
	}
}



public class NEx_14 {
	public static void main(String[] args) {
	}

}
