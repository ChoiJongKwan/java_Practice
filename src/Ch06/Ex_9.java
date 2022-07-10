package Ch06;


class MyMath2{
	long a, b;
	long add() {return a+b;}
	long sub(){return a -b;}
	long mul(){return a *b;}
	double divide() {return a/b;}
	
	
	static long add(long a, long b) {return a+b;}
	static	long sub(long a, long b){return a -b;}
	static	long mul(long a, long b){return a *b;}
	static	double divide(long a, long b) {return a/b;}
	
}



public class Ex_9 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.sub(200L, 100L));
		System.out.println(MyMath2.mul(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		
		MyMath2 mm= new MyMath2();
		mm.a=200L;
		mm.b=100L;
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.divide());
	}

}
