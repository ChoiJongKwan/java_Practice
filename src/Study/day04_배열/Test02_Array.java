package day04_배열;

import java.util.Scanner;

public class Test02_Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] b= new int[5];
		int tot=0;
		for(int i=0;i<5;i++) {
			b[i]=sc.nextInt();
			tot+=b[i];
		}
		System.out.println("입력된 학생 점수");
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		System.out.println("총점: "+tot);
	}
}
