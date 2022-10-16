package day02_제어문;

import java.util.Scanner;

public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어점수와 영어점수를 입력하시오");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int total=kor+eng;
		double ave= total/2.0;
		if(ave>=90)
			System.out.println("당신의 학점은 A입니다" );
		else if (ave>=80) {
			System.out.println("당신의 학점은 B입니다" );
		}else if (ave>=70) {
			System.out.println("당신의 학점은 C입니다" );
		}else if (ave>60) {
			System.out.println("당신의 학점은 D입니다" );
		}else {
			System.out.println("당신의 학점은 f입니다" );
		}
	}
}
