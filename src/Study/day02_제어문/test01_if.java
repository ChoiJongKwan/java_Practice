package day02_제어문;

import java.util.Scanner;

/*
 * [제어문]
 * -조건문과 반복제어문이있다
 * 1.조건제어문
 * 1)if 문
 * 형식1)
 * if(조건식){
 * 조건이 참일때 수행할문장;
 * }
 * 형식2)
 * if(조건식){
 * 조건이 참일때 수행할문장;
 * }else{
 * 조건이 거짓일때 수행할 문장;
 * }
 * 형식3)
 * if(조건식1){
 * 조건식1이 참일때 수행할문장;
 * }else if(조건식 2){
 * 조건식 2가 참일때 수행할문장
 * }
 * ...
 * else{
 * 조건이 모두 거짓일때 수행할 문장
 * }
 */
public class test01_if {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("임의의 정수를 입력하시오");
		int a=sc.nextInt();
		String result = "짝수";
		if(a%2!=0) {
			result="홀수";
		}
		System.out.println(a+"은 "+result +"입니다");
		System.out.println("첫수를 입력하시오");
		int b=sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
		int c=sc.nextInt();
		if(b>c) {
			System.out.println("큰값은 "+b+"입니다");
		}else {
			System.out.println("큰값은 "+c+"입니다");
		}
		
		
	}
}
