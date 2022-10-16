package day03_제어문;

import java.util.Random;
import java.util.Scanner;

public class test06_for {
public static void main(String[] args) {
	Random rnd= new Random();
	for(int i=1;i<=10;i++) {
		int n=rnd.nextInt(10);
		System.out.println(n);
	}
	System.out.println();
	
	Scanner sc= new Scanner(System.in);
	int n1=rnd.nextInt(10)+1;
	int cnt=0;
	for(;;) {
		
		System.out.println("예상되는 숫자를 입력하세요");
		int n2= sc.nextInt();
		if(n1==n2) {
		System.out.println("숫자를 맞추었어요>> "+n2);
		System.out.println("입력된 횟수>>"+cnt);
		break;
		}else {
			cnt++;
		}
		
	}
	
	
	
	
}
}
