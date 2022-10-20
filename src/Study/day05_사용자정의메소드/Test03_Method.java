package day05_사용자정의메소드;

public class Test03_Method {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		printArray(a);
		int sum= getsum(a);
		System.out.println(sum);
	}

	private static int getsum(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	private static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
} 
