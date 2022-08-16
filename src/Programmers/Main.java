package Programmers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Solution sl= new Solution();
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt(),B= sc.nextInt();
		
		
		System.out.println(sl.solution(A, B));
	}

}
class Solution {
	public long[] solution(int n, int m) {
		long small=0;
		long max=0;
		if(n==0&&m==0){
			small=n;
			max=n;
		}
		else if(n>m) {
			for(int i=0; i<=n;i++) {
				if(n%i==0&&m%i==0)
					small=i;
			}
			for(int i=n;i<=n*m; i++) {
				if(i%n==0&&i%m==0)
					max=i;
			}
			
			
		}else if (m>n) {
			for(int i=1; i<=m;i++) {
				if(n%i==0&&m%i==0)
					small=i;
			}
			for(int i=m;i<=n*m; i++) {
				if(i%n==0&&i%m==0)
					max=i;
			}
		}
		
		
		
		
		
		long[] answer = {small,max};
		return answer;
	}
}