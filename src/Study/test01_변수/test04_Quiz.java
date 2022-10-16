package test01_변수;

import java.util.Scanner;

//학생 이름/국어,영어 점수 입력받아 총점 평균 구해서 출력하시오
public class test04_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		double avg=0;
		System.out.println("이름을 입력하시오");
		String name= sc.next();
		System.out.println("국어점수를 입력하시오");
		int korScore=sc.nextInt();
		System.out.println("영어점수를 입력하시오");
		int engScore=sc.nextInt();
		sum=korScore+engScore;
		avg=sum/2.0;
		System.out.println("당신의 이름은 "+name+" 이고 총점은 "+sum+"점 입니다 평균은 "+avg+"점 입니다");
		
		
	}
}
