package day05_2차원배열;

public class Test03_Quiz {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{0,0,0}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			a[3][i]=a[3][i]+a[j][i];
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
