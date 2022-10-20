package day05_2차원배열;
/*
 * <2차원 배열>
 * 첨자가 2개인 배열
 * int[][] a= new int[3][4] ->3행 4열로 배열방이 12개 만들어짐
 */
public class Test01_2차원배열 {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+ " ");
			}
		}
		
	}
}
