package day08_상속1;

import test.Shape;

public class TestMain {
	public static void main(String[] args) {
		Shape s= new Shape(5, 9);
		s.printXY();
		s.draw();
		System.out.println();
//		s.x=300;   //다른 패키지라서 에러
//		s.y=400;   //다른 패키지라서 에러
		s.printXY();
		s.draw();
	}
}
