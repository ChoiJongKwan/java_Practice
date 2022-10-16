package day03_제어문;

import java.util.Scanner;

public class Test01_while {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while (true) {
			System.out.println("원하는 단을 입력하세요");
			int n= sc.nextInt();
			if(n==0)break;
				
			int i=0;
			while (i<=9) {
				System.out.println(n+"*"+i+"="+(n*i));
				i++;
			}
			
			
		}
		
	}
}
