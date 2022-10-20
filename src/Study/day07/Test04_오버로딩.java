package day07;
/*
 * [오버로딩]
 * -같은이름의 메소드를 중복해서 정의하는것
 * -메소드 이름은 같지만 파라미터 타입이나 갯수는 달라야한다
 * 예)
 * class AA{
 * 		public int add(int x, int y){
 * 			return  x+y;
 * 		}
 * 		public int add(int x, int y, int z){---> 오버로딩
 * 			return  x+y+z;
 * 		}
 * 		public void add(int x, int y){--->안됨 에러
 * 			System.out.println(x+y);
 * 		}
 * 		public int add(int x, double y){
 * 			return  x+y;
 * 		}
 * 		public int add(double x, int y){--> 가능
 * 			return  x+y;
 * 		}
 * }
 */
class Rect{
	
	public int getArea(int x, int y) {
		return x*y;
		
	}
	public double getArea(double x, double y) {
		return x*y;
		
	}
	public int getArea(int x) {
		return x*x;
		
	}
	
}
public class Test04_오버로딩 {
	public static void main(String[] args) {
		Rect r= new Rect();
		
		
		
		System.out.println(r.getArea(5));
		System.out.println(r.getArea(3.4,2.8));
		System.out.println(r.getArea(5,7));
	}
}
