package backjun;

import java.util.Scanner;

public class BackJun2884 {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int A= sc.nextInt();
		int B= sc.nextInt();

		if(A>0&&B>=45)
			System.out.println(A+" "+(B-45));
		else if (A>0&&B<45) {
			System.out.println(A-1+" "+(60-(45-B)));
		}else if (A==0&&B<45) {
			System.out.println(23+" "+(60-(45-B)));
		}else if((A==0&&B>=45)){
			System.out.println(A+" "+(B-45));
		}else {
			
			System.out.println("Error");
		}
			
	
	}
}
