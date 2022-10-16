package day02_연산자;

import java.util.Scanner;

/*
 * <삼항 연산자>
 * 
 * (조건식)?결과값1:결과값2
 * 
 * ->조건식이 참이면 결과값1, 조건이 거짓이면 결과값2가 수행됨
 * 
 */
public class test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 정수입력");
		int n1=sc.nextInt();
		System.out.println("두번째 정수입력");
		int n2=sc.nextInt();
		int n3=(n1>n2)?n1:n2;
		System.out.println(n1+"과"+n2+"중에 큰 수:"+n3);
		
	}
}
