package CH04;

public class REx4_7 {
	public static void main(String[] arg) {
		int num = 0;
		
		//괄호 안의 내용을 20번 반복
		//Q. 1~10사이의 난수를 20개 출력하시오
		//Q2.-5~5 사잉의 난수를 20개 출력하시오
		// -5 -4 -3 -2 -1 0 1 2 3 4 5  11개
		for(int i =0; i<=10; i++) {
			
			
			//System.out.println((int)(Math.random()*10)+1);		
			System.out.println((int)(Math.random()*11)-5);		
		}
		
		
		
		
		
	}
}
