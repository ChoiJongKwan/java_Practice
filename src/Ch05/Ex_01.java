package Ch05;


import java.util.Arrays;
import java.util.function.IntPredicate;

public class Ex_01 {

	public static void main(String[] args) {
//		int[] score;         //배열 스코어를 선언(참조변수)
//		score = new int[5];	// 배열의 생성 (5칸)
//		score[3]=100;
//		System.out.println(score[3]);
//		int[] arr = {100,90,80,70,60,50,40,30,20,10,0};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
		int[] iarr1 = new int[10];
		int[] iarr2 = new int[10];
		int[] iarr3 ={100,90,80,70,60,50};
		char[] charr = {'a','b','c','d'};
		
		for(int i=0;i<iarr1.length;i++) {
			iarr1[i]=i+1;
		}
		for(int i=0;i<iarr2.length;i++) {
			iarr2[i]=(int) ((Math.random()*10)+1);
		}
		for(int i=0;i<iarr1.length;i++) {
			System.out.print(iarr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(iarr3));
		System.out.println(Arrays.toString(charr));
		System.out.println(iarr3);
		System.out.println(charr);

	}

}
