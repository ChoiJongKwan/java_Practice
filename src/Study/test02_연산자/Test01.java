package test02_연산자;

import java.util.Scanner;

/*
 * <자바의 연산자>
 * 1.산술 연산자'
 * +,-,*,/,%(나머지)
 * 
 * 2.관계연산자
 * >,>=,==,<,<=,!=(같지않다)
 * 
 * 3.논리연산자
 * !(not) : 어떠한값이 참이면 거짓, 거짓이면 참으로 결과값을 가진다
 * &&(and) : 대응되는 두개의 값이 모두 참이면 결과가참
 * ||(or) : 대응되는 두개의 값이 모두 거짓이면 결과가 거짓
 * 
 * <if문>
 * if(조건식){
 * 	조건이 참이면 수행하는 문장;
 * }else{
 * 조건이 다르면 수행할 문장;
 * }
 */
public class Test01 {

	public static void main(String[] args) {
		int a= 10%3;
		System.out.println("10을 3으로 나눈 나머지값" +a);
		Scanner sc= new Scanner(System.in);
		int b= sc.nextInt();
		if(b%2==0) {
			System.out.println(b+"은 짝수입니다");
		}else {
			System.out.println(b+"은 홀수입니다");

		}
		
		
		
	}

}
