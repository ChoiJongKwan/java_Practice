package test02_연산자;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("국어점수입력");
		int kor=sc.nextInt();
		System.out.println("영어점수입력");
		int eng=sc.nextInt();
		if(kor>=80&&eng>=80) {
			System.out.println("합격!!");
		}else {
			System.out.println("불합격!!");
		}
	}

}
