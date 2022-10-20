package day06;
class MyCircle{
	private double r;
	public MyCircle() {
		r=5.0;
	}
	public MyCircle(double r) {
		this.r=r;
	}
	public void showArea() {
		System.out.println("반지름: "+r);
		System.out.println("원의 넓이: " +(r*r*3.14));
	}
}

public class Test06 {
	public static void main(String[] args) {
		MyCircle mc= new MyCircle();
		mc.showArea();
		MyCircle mc2=new MyCircle(4.5);
		mc2.showArea();
	}
}
