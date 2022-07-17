package Study0716;


import java.util.Scanner;

public class BackJun2908 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		int tmp1 = 0;
		int tmp2 = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=0;i<3;i++) {
			int n = num1%10;
			arr[i]=n;
			num1=num1/10;
//			if(arr[0]==arr[0]&&arr[1]==arr[1]&&arr[2]==arr[2]) {
//				tmp1=(arr[0]*100)+(arr[1]*10)+arr[2];
//			}
//			if (arr[1]==arr[1]) {
//				tmp1=tmp1+arr[1]*10;
//			}
//			if(arr[2]==arr[2]) {
//				tmp1=tmp1+arr[2];
//			}
		}
//		tmp1=(arr[0]*100)+(arr[1]*10)+arr[2];
		int k=100;
		for(int i=0;i<arr.length;i++) {
			tmp1=tmp1+(arr[i]*k);
			k=k/10;
		}
		
		for(int i=0;i<arr2.length;i++) {
			int n = num2%10;
			arr2[i]=n;
			num2=num2/10;
			if(arr2[0]==arr2[0]) {
				tmp2=arr2[0]*100;
			}
			if (arr2[1]==arr2[1]) {
				tmp2=tmp2+arr2[1]*10;
			}
			if(arr2[2]==arr2[2]) {
				tmp2=tmp2+arr2[2];
			}
		}
		
		System.out.println(tmp1);
		System.out.println(tmp2);
		if(tmp1>tmp2) {
			System.out.println(tmp1);
		}else {
			System.out.println(tmp2);
		}
	
	
	}

}
