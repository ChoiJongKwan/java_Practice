package day08_상속1;

import test.Shape;

public class RectTest extends Shape {
	public RectTest(int a, int b) {
		super(a,b);
		//this.x=100;
		//x=100;  //패키지가 달라서 지식클래스라도 접근 불가
		color="RED";//패키지가 달라도 자식클래스는 접근가능-protected
	}
	public void drawRect() {
		printXY();
		System.out.println("색상: "+color);
		System.out.println("사각형 그리기");
	}
	public static void main(String[] args) {
		RectTest rt= new RectTest(1, 2);
		rt.drawRect();
		
	}
}
