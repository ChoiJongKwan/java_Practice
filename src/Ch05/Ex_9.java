package Ch05;

import java.util.Scanner;


public class Ex_9 {

	public static void main(String[] args) {
		int[][] score= {
				{100,95,90},
				{20,30,40},
				{50,55,60},
				{70,80,85}
		};
		int kortotal = 0,engtotal=0,mathtotal=0;
		System.out.println("번호   국어   영어   수학   총점   평균 ");
		System.out.println("==================================");
		
		for(int i=0;i<score.length;i++) {
			int sum=0;
			float avg=0.0f;
			
			kortotal+= score[i][0];
			engtotal+= score[i][1];
			mathtotal+= score[i][2];
			System.out.printf("%5d",i+1);
			
			for(int j=0;j<score[i].length;j++) {
				sum+= score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg=sum/(float)score[i].length;
			System.out.printf("%5d  %5.1f%n",sum,avg);
			
			
			
		}
		
		System.out.println("==================================");
		System.out.printf("총점 :  %3d  %4d  %4d\n",kortotal,engtotal,mathtotal);
		
		
	}

}
