package Ch05;

import java.util.function.IntPredicate;

public class Ex_3 {

	public static void main(String[] args) {
	 int[] score = {79,88,91,33,100,55,95};
	 int max=score[0],min=score[0];
	 
	 for(int i=1;i<score.length;i++) {
		 if(score[i]>max) {
			 max=score[i];
		 }else if (score[i]<min) {
			min= score[i];
		}
	 }
	 System.out.println(max);
	 System.out.println(min);
	 
	}

}
