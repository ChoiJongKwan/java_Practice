package test02_연산자;

import java.util.Scanner;

public class test03_Quiz {
	/*
	 * 이름 국어 영어 점수입력받아 총점 평균구하고 평균이 80이상 합격
	 * 단 각과목의 점수가 60점이상이여야함
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name=sc.next();
		System.out.println("국어점수를 입력하세요");
		int kor=sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng=sc.nextInt();
		int sum=kor+eng;
		int ave=sum/2;
		System.out.println("입력한 모든값");
		System.out.println("name= "+name);
		System.out.println("kor= "+kor);
		System.out.println("eng= "+eng);
		System.out.println("sum= "+sum);
		System.out.println("ave="+ave);
		if(ave>=80&&kor>=60&&eng>=60) {
			System.out.println("합격!!");
		}else {
			System.out.println("불합격!!");
		}
		
		
		
	}

}
