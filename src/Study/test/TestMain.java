package test;

public class TestMain {
	public static void main(String[] args) {
		Shape s= new Shape(5, 9);
		s.printXY();
		s.draw();
		System.out.println();
		s.x=300;
		s.y=400;
		s.printXY();
		s.draw();
	}
}
