package day05_2차원배열;

import java.util.Scanner;

public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] stu=new int[4][6];
		for(int i=0;i<4;i++) {
			System.out.println("학생의 번호,국어,영어,수학점수를 입력하시오");
			for(int j=0;j<4;j++) {
				stu[i][j]=sc.nextInt();
				stu[i][4]+=stu[i][j];
				
			}
			stu[i][4]-=stu[i][0];
			stu[i][5]=stu[i][4]/3;
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(stu[i][j] +" ");
			}
			System.out.println();
		}
	}
}
