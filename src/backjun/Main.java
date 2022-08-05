package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int Dice[]= {A,B,C};
		int money = 0;
		
		
		if (A==B&&B==C) {
			money=10000+(A*1000);
			
		}else if (A==B||B==C||A==C) {
			if(A==B)
				money=1000+(A*100);
			else if(A==C)
				money=1000+(A*100);
			else 
				money=1000+(B*100);
		}else {
			Arrays.sort(Dice); // 오름차순으로 정렬하여 가장큰값을 Dice[2]에 저장
			money=100*Dice[2];
		}
			
		
		System.out.println(money);
	}
}
