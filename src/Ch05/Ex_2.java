package Ch05;

public class Ex_2 {

	public static void main(String[] args) {
		int sum=0;
		float average=0f;
		int[] score = {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];					//스코어의 총합을 썸에 담는다
		}
		average = (float) sum/score.length; // float로 변환을 안해주면 int로 결과가 나옴
		System.out.println(sum);
		System.out.println(average);
	}

}
