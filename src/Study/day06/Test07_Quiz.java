package day06;
class Circle{
	private double r;
	public Circle() {
		r=5.0;
	}
	public Circle(double r) {
		this.r=r;
	}
	public void showArea() {
		System.out.println("반지름: "+r);
		System.out.println("원의 넓이: " +(r*r*3.14));
	}
}
public class Test07_Quiz {
	public static void main(String[] args) {
		
	}
}
