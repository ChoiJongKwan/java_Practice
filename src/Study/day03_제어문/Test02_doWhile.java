package day03_제어문;

import java.util.Scanner;

/*
 * [do -while문]
 * 조건식이 거짓일때까지 반복수행
 * while문이 조건절을 먼저 판단하고 실행하지만 do while문은 먼저 실행하고 조건절을 판단한다
 */
public class Test02_doWhile {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
			
		Scanner sc =new Scanner(System.in);
		int dan=0;
		do {
			System.out.println("단 입력");
			dan=sc.nextInt();
		}while(!(dan>=2&& dan<=9));
		System.out.println(dan+"단");
		for(i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
	}
}
