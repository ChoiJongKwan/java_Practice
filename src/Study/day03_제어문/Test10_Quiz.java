package day03_제어문;

import java.util.Scanner;

public class Test10_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1;
//		int sum=0;
//		while(i<=100) {
//			if(i%3==0) {
//				System.out.print(i +" ");
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println();
//		System.out.println("합계:"+sum);
		
		int n=sc.nextInt();
		while(i<=9) {
			System.out.println(n+"*"+i+"="+(n*i));
		i++;
		}
		
	}
}
