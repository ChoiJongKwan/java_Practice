package day04_배열;

import java.util.Random;

public class Test06_Quiz {
	public static void main(String[] args) {
		
		Random rnd= new Random();
		int a[]= new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=rnd.nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					i--;
					break;
				}
			}
		}
		
		
		
		
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		
	}
}
