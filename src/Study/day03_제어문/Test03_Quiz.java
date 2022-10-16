package day03_제어문;

public class Test03_Quiz {
	public static void main(String[] args) {
		
		int i=1;
		do {
			System.out.print(i +" ");
			
			if(i%10==0)
				System.out.println();
			i++;
		} while (i<=100);
		
		
	}
}
