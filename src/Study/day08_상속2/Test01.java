package day08_상속2;
/*
 * [오버라이딩]
 * 부모클래스의 메소드를 자식클래스에서 수정하고자 할때 오버라이딩을 한다
 * -만드는 방법
 * 부모클래스의 메소드명,리턴형,파라미터타입과 갯수 모두 일치해야 한다.
 * 예)
 * class parent{
 * 		public void print(){}
 * }
 * class child extends parent{
 * public void print(){} //  오버라이딩
 * public void print(String s){}// 오버 로딩
 */

import test.Shape;

class Rect extends Shape {
	public Rect(int a, int b) {
		super(a,b);
	
	}
	public void draw() {
		System.out.println("사각형 그리기");
	}
	public void draw(String color) {
		System.out.println(color+"색상 사각형 그리기");
	}
}
class Circle extends Shape{
	private double r;
	public Circle(int a, int b,double z) {
		super(a, b);
		this.r= z;
	}
	public void draw() {
		System.out.println("반지름이"+r+"인 타원그리기");
	}
	public void draw(Double z) {
		System.out.println("반지름이 "+z+"인 타원그리기");
		r=z*z*3.14;
		System.out.println("타원의 넓이는 "+r+"입니다.");
	}
	
}
public class Test01 {
	public static void main(String[] args) {
		Rect r= new Rect(100, 200);
		r.printXY();
		r.draw();
		r.draw("BLUE");
		System.out.println();
		Circle c= new Circle(100, 200,7.4);
		c.printXY();
		c.draw();
		c.draw(7.4);
		
		
	}
}
