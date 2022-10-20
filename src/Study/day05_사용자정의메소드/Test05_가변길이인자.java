package day05_사용자정의메소드;

public class Test05_가변길이인자 {
	public static void main(String[] args) {
		print(10,20,30);
		print(100,200);
		
	}

	private static void print(int n, int ...arr) {
		System.out.println("n:"+n);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]"+arr[i]);
		}
		System.out.println();
	}
}
