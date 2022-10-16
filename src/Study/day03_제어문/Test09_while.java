package day03_제어문;
/*
 * -whlie문
 * 
 * while(조건식){
 * 반복실행할 문장
 * }
 * 조건식이 거짓일때까지 실생
 */
public class Test09_while {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
	}
}
