package Ch05;


public class Quiz_4 {

	public static void main(String[] args) {
		//2차원의 배열 에담긴 모든값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		int total = 0;
		float avg = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j];
				
			}
		}
	avg=(float)total/(arr.length*arr[0].length);
		
		System.out.println(total);
		System.out.println(avg);
	}

}
