package day04_배열;

import java.util.Iterator;
import java.util.Scanner;

public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] dap= {1,2,3,4,5,1,2,3,4,5};
		int[] inputdap= new int[10];
		int cnt=0,score=0;
		char[] ox= new char[10];
		for(int i=0;i<dap.length;i++ ) {
			System.out.println(i+1+"번째 답을 입력해주세요 ");
			inputdap[i]=sc.nextInt();
			if(inputdap[i]==dap[i]) { 
				ox[i]='O';
				cnt++;
			}else {
				ox[i]='X';
			}
		}
		System.out.print("정답은 ");
		for(int i=0;i<dap.length;i++) {
			System.out.print(dap[i]+" ");
		}
		System.out.println("입니다 ");
		System.out.print("당신이 입력하신 답은");
		for(int i=0;i<inputdap.length;i++) {
			System.out.print(inputdap[i]+" ");
		}
		System.out.println("입니다 ");
		for(int i=0;i<ox.length;i++) {
			System.out.print(ox[i]+" ");
		}
		score=cnt*10;
		System.out.println("당신의 총점은 "+score+" 입니다.");
	}
}
