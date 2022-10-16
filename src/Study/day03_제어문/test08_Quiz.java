package day03_제어문;

import java.util.Random;
import java.util.Scanner;

public class test08_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cnt=0;
		for(int i=1;i<=10;i++) {
			System.out.println("정답을 입력하세요");
			Random rnd= new Random();
			int a=rnd.nextInt(100)+1;
			int b=rnd.nextInt(100)+1;
			System.out.println(a+"+"+b+"=");
			int ans= sc.nextInt();
			if(a+b==ans) {
				cnt++;
			}
			
			
			
		}
		System.out.println(cnt+"개 맞추셨습니다.");
		
	}
}
