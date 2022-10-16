package day02_제어문;

import java.util.Scanner;

public class Test06_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오");
		int n1=sc.nextInt();
		System.out.println("두번째 정수를 입력하시오");
		int n2=sc.nextInt();
		System.out.println("사칙연산을 입력하시오");
		String str=sc.next();
		switch(str) {
		case "+": 
			System.out.println(n1+str+n2+"="+(n1+n2));
			break;
		case "-": 
			System.out.println(n1+str+n2+"="+(n1-n2));
			break;
		case "*": 
			System.out.println(n1+str+n2+"="+(n1*n2));
			break;
		case "/": 
			System.out.println(n1+str+n2+"="+(n1/n2));
			break;
			
		default: System.out.println("잘못 입력하셧습니다.");
		}
		
	}
}
