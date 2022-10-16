package day02_제어문;
/*
 * [for 문]
 * 조건식이 거짓일때까지 반복적으로 문장을 수행
 *
 *for(초기식:조건식:증감식){
 *반복할문장
 *}
 */
public class Test08_for {
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<100;i++) {
		if(i%2!=0)	
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println();
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
