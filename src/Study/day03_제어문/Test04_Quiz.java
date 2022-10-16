package day03_제어문;

public class Test04_Quiz {
	public static void main(String[] args) {
//		for(int i=1;i<=9;i++) {
//			System.out.print("["+i+"단]  ");
//			for(int j=1;j<=9;j++) {
//				System.out.print(i+"*"+j+"="+(i*j) +" ");
//				
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i=1;i<=9;i++) {
//			
//			for(int j=1;j<=9;j++) {
//				System.out.print(j+"*"+i+"="+(i*j) +" ");
//				
//			}
//			System.out.println();
//			
//		}
		for(int i=1;i<=5;i++) {
			int j=1;
			for(int c=65; j<=i;j++) {
				System.out.print((char)c);
				c++;
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
