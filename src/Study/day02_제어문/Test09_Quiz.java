package day02_제어문;

public class Test09_Quiz {
	public static void main(String[] args) {
		int sum1=0,sum2=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
		}
		System.out.println("짝수의 합은:"+sum1);
		System.out.println("홀수의 합은:"+sum2);
		System.out.println();
		int sum3=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
			System.out.print(i+" ");
			sum3+=i;
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합은:"+sum3);
		
	}
}
