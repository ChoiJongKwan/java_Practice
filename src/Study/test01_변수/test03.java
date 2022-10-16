package test01_변수;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력1");
		int n1=sc.nextInt();
		System.out.println("정수입력2");
		int n2=sc.nextInt();
		int n3=n1+n2;
		System.out.println("두수의합은:"+n3);
		
		System.out.println("실수입력");
		double d= sc.nextDouble();
		System.out.println("입력된정수:" +  d);
		System.out.println("이름을입력하세요");
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println("당신의 이름은:" +str);
	}

}
