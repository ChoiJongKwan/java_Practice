package day08_상속1;
class Rect{
	private int x;
	private int y;
	private int area;
	
	public Rect(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int areaCheck() {
		area= x*y;
		return area;
	}
	
	
}

class Rect2 extends Rect{
	private int z;
	private int vol;
	public Rect2(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
	
	public int volCheck() {
		vol= areaCheck()*z;
		return vol;
	}
	
	
}

public class Test05_Quiz {
	public static void main(String[] args) {
		Rect2 r= new Rect2(3, 6, 9);
		System.out.println("넓이: "+r.areaCheck());
		System.out.println("부피: "+r.volCheck());
	}
}
