package day05_사용자정의메소드;
/*
 * [사용자 정의 메소드]
 * 어떠한 기능을 갖는 코드의 묶음
 */
public class Test01_Method {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=sum(a,b);
		System.out.println(c);
	}
	public static int sum(int  x, int y) {
		int c=x+y;
		return c;
	}
}	
