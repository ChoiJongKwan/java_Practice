package Ch05;

public class Ex_8 {

	public static void main(String[] args) {
		int[][] score= {
				{100,95,90},
				{20,30,40},
				{50,55,60},
				{70,80,85}
		};
		int sum=0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
				sum+=score[i][j];
				
			}
		}
		System.out.println(sum);
		
		
	}

}
