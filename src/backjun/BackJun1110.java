package backjun;

import java.util.Scanner;

public class BackJun1110 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			
			int cnt=0;
			String F = sc.next();
			String S = F;
			
			if(F.length()<2) {
				S="0"+F;
			}
			while(true){
				int sum=0;
				for(int i = 0; i<S.length(); i++ ) {
					sum += S.charAt(i)-48;
				}
			S = S.charAt(1)+Integer.toString(sum%10);
			cnt++;
			if(F.equals(S)||S.equals("0"+F)) break;
			}
			System.out.print( cnt);



		}


	}

