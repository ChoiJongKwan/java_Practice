package day04_배열;

import java.util.Scanner;

public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] n=new int[5];
		int max=0;
		int min=101;
		for(int i=0;i<5;i++) {
			System.out.println("학생의 점수를 입력하세요");
			n[i]=sc.nextInt();
			if(max<n[i]) max=n[i];
			if(min>n[i])min=n[i];
		}
		System.out.println("학생중 가장높은 점수는"+max+"점 입니다");
		System.out.println("학생중 가장낮은 점수는"+min+"점 입니다");
	}
}
