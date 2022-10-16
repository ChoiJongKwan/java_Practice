package day04_배열;

import java.util.Scanner;

public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] soc=new int[10];
		int tot=0;
		int cnt=0;
		for(int i=0;i<10;i++) {
			System.out.println("학생의 점수를 입력하세요");
			soc[i]=sc.nextInt();
			tot+=soc[i];
			if(soc[i]>=80) cnt++;
		}
		double ave=tot/10.0;
		
		System.out.println("총점:"+tot);
		System.out.println("80점 이상의 학생수:"+cnt);
		System.out.println("평균:"+ave);
		
	}
}
