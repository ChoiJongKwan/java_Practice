package day03_제어문;

import java.util.Scanner;

public class Test01_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		System.out.println("원하는 구구단의 단을 입력하시오");
		for(int i=1; i<=9;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		for(int i=0;i<=25;i++) {
			char ch='A';
			System.out.print((char)(ch+i)+" ");
		}
		System.out.println();
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
			if(i%10==0)
				System.out.println();
		}
		
		
	}
}
