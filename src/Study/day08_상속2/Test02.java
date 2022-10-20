package day08_상속2;
class Box{
	protected double w;
	protected double h;
	public void setXY(double w, double h) {
		this.w=w;
		this.h=h;
	}
	public double getArea() {
		return w*h;
	}
}

class Tri extends Box{
	public Tri(Double x, Double y) {
		this.w=x;
		this.h=y;
	}
	public double getArea() {
		return (w*h)/2.0;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Tri t= new Tri(5.7,6.9);
		System.out.println("삼각형의 넓이: "+t.getArea());
	}
}
