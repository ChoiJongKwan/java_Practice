package backjun;

import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {

		Scanner sc =new Scanner(System.in);
		int cnt=0;
		String A= sc.next();
		String B= A;
		
		if(A.length()<2)
			B="0"+A;
		
		while(true){
			int sum=0;
			for(int i = 0; i<B.length(); i++ ) {
				sum += B.charAt(i)-48;
			}
		B = B.charAt(1)+Integer.toString(sum%10);
		cnt++;
;
		if(A.equals(B)||A.equals("0"+B)) break;
		}
		
		System.out.print( cnt);



	}


}
