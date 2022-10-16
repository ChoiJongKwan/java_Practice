package day02_연산자;

import java.util.Scanner;

//임의의 정수를 입력받아 삼항연산자를 사용해서 절대값을 구해보세요
public class test02_Quiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=(a>0)?a:-a;
		
		System.out.println(b);
	}

}
