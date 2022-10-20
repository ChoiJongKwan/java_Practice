package day05_사용자정의메소드;

import java.util.Scanner;

public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("가로 길이 입력");
		double x= sc.nextDouble();
		System.out.println("세로 길이 입력");
		double y= sc.nextDouble();
		double area=boxArea(x,y);
		System.out.println("사각형의 넓이: "+area);
		System.out.println();
		System.out.println("두 정수를 입력해주세요");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3=big(n1,n2);
		System.out.println(n1+"과 "+n2+" 중에 더큰수는"+n3+"입니다.");
		System.out.println();
		System.out.println("반지름 입력");
		double r= sc.nextDouble();
		double area2=circle(r);
		System.out.println("원의넓이는:" +area2);
	}

	private static double circle(double r) {
		double area= r*r*3.14;
		return area;
	}

	private static int big(int n1, int n2) {
		int n;
		if(n1>n2) {
			n=n1;
		}else {
			n=n2;
		}
		return n;
	}

	private static double boxArea(double x, double y) {
		double area= x*y;
		return area;
	}
}
