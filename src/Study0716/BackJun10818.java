package Study0716;

import java.util.*;

public class BackJun10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min=1000001;
		int max=0;
		int[] arr = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		
		System.out.println(min +" "+max);
		
	}

}
