package day03_제어문;

public class test12_Quiz {
	public static void main(String[] args) {
		char a='A';
		int i=0;
		while(i<5) {
		int j=0;
			while (j<=i) {
			System.out.print((char)(a+j));
			j++;
			}
			System.out.println();
			i++;
		}
	}
}
