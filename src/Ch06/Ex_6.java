package Ch06;

class Date{int x;}

public class Ex_6 {

	public static void main(String[] args) {
		Date date =new Date();
		date.x=10;
		System.out.println("main():x = "+date.x);
		
		change(date.x);
		System.out.println("after change(d.x) ");
		System.out.println("main():x = "+date.x);

		
	}
	static void change(int x) {
		x=10000;
		System.out.println("change(): x="+x);
	}
}
