package day07;
class Quiz{
	public static int add(int x, int y) {	
		return x+y;
	}
	public static int min(int x, int y) {	
		return x-y;
	}	
	
	public static int mul(int x, int y) {	
		return x*y;
	}	
	
	public static double div(int x, int y) {	
		return x/y;
	}
	
}

public class Test07_Quiz {
	public static void main(String[] args) {
		int a=Quiz.add(6, 9);
		int b= Quiz.min(5, 9);
		int c=Quiz.mul(7, 7);
		double d=Quiz.div(18, 2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
