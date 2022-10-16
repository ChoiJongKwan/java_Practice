package day02_제어문;

import java.util.Scanner;

public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("국어,영어의 점수를 입력하시오");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int total=kor+eng;
		double ave=total/2.0;
		String grade; 
		switch((int)ave/10) {
			case 10:grade="A+"; break;
			case 9: grade="A"; break;
			case 8: grade="B"; break;
			case 7: grade="C"; break;
			case 6: grade="D"; break;
			default :grade="F";
		}
		System.out.println("총점:"+total);
		System.out.println("평균:"+ave);
		System.out.println("학점:"+grade);
		
	}
}
