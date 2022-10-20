package day05_2차원배열;

public class Test02_Quiz {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum+=a[i][j];
			}
			a[i][3]=sum;
			sum=0;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}
}
