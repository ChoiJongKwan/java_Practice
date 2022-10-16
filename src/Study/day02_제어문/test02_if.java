package day02_제어문;

import java.util.Scanner;

public class test02_if {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두정수 입력");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+"이 더 큰값입니다");
		}else if (n1<n2) {
			System.out.println(n2+"이 더 큰값입니다");
		}else {
			System.out.println("두수는 같습니다");
		}
	}
}
