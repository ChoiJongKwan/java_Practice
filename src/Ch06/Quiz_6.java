package Ch06;
class MyPoint{
	int x,y;
	
	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	double getDistance(int x1, int y1){
		
		return (double) Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
	}
	
	
	
}


public class Quiz_6 {

	public static void main(String[] args) {
		MyPoint p=new MyPoint(1, 1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}

}
