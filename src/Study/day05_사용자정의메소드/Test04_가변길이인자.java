package day05_사용자정의메소드;

public class Test04_가변길이인자 {
	public static void main(String[] args) {
		int c=sum(1,2,3);
		System.out.println(c);
		int c1= sum(1000,200);
		System.out.println(c1);
		
	}

	private static int sum(int ... j) {
		int s=0;
		for(int i=0;i<j.length;i++) {
			s+=j[i];
		}
		return s;
	}

	
}
