package day07;
class Mymath{
	public int getAbs(int x) {
		if(x<0) {
		return-x;
		}
		return x;
	}
	public float getAbs(Float x) {
		if(x<0) {
		return-x;
		}
		return x;
	}
	public double getAbs(Double x) {
		if(x<0) {
		return-x;
		}
		return x;
	}
}

public class Test05_Quiz {
	public static void main(String[] args) {
		Mymath a= new Mymath();
		System.out.println(a.getAbs(12));
		System.out.println(a.getAbs(-12));
		System.out.println(a.getAbs(12.5));
		System.out.println(a.getAbs(-12.7));
		System.out.println(a.getAbs(12.6f));
		System.out.println(a.getAbs(-12.9f));
		
		
		
	}
}
