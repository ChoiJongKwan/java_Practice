package Ch06;

public class Quiz_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
		//두점의 거리를 구하는 공식은 위와 같다( 루트 (x-x1)제곱 + (y-y1)제곱 이다.
		//return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2)); 같은내용 다른코드
	}
	
	

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
