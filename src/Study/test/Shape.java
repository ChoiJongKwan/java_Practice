package test;

public class Shape {
	int x;
	int y;
	protected String color;
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public void printXY() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	public void draw() {
		System.out.println("도형 그리기");
	}
}
