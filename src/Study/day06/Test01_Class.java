package day06;
/*
 * [객체지향 프로그래밍]
 * -모든 작업을 객체화 해서 프로그래밍하는 기법
 * -객체지향 프로그래밍에서는 모든작업을 클래스로 구현한다.
 * -클래스만드는방식
 * class 클래스명 (
 * 맴버변수;
 * 멤버메소드(){..}
 * }
 * -클래스를 사용하기위해서는 객체(인스턴스)를 생성해야한다
 * -객체 생성형식
 * 클래스명 갤체명 =new 클래스명();
 * 
 * <접근지정자>
 * private-같은 클래스내에서만 접근가능
 * default-같은 패키지내에서만 접근가능
 * public- 어디서나 접근가능
 * protected- 같은패키지+상속받은 자식클래스에서만 접근가능
 * 
 */
class Rect{
	private int x;
	private int y;
	private String color;
	public void setData(int x1, int y1, String color1) {
		x=x1;
		y=y1;
		color=color1;
	}
	public void draw() {
		System.out.println(x+","+y+"의 위치에 사각형 그리기");
	}
	public void paint() {
		System.out.println(color+"로 사각형을 칠해요");
	}
}
public class Test01_Class {
	public static void main(String[] args) {
		Rect r= new Rect();
	//	r.x=100;
		r.setData(100,100,"RED");
		r.draw();
		r.paint();
	}
}
