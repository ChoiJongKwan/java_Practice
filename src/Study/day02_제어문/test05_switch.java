package day02_제어문;

import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.swing.SwingConstants;

/*
 * [switch문]
 * 일치되는 값을 찾아 선택적으로 문장을 수행
 * 
 * switch(비교대상){
 * case 값1:실행문장; break;
 * case 값2:실행문장; break;
 * ...
 * default:일치되는 값이 없을때 실행된다
 * }
 * case절에는 정수형상수/단일문자/문자열만 올수있다(실수,조건절 X)
 */
public class test05_switch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("상품 번호 입력");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("상품:TV");
			break;
		case 2:
			System.out.println("상품:컴퓨터");
			break;
		case 3:
			System.out.println("상품:냉장고");
			break;
		case 4:
			System.out.println("상품:스마트폰");
			break;
		default:
			System.out.println("상품없음");
		}
		System.out.println("상품권 코드 입력");
		String code = sc.next();
//		switch(code) {
//		case "a1":
//		case "A1":System.out.println("100만원 상품권 당첨!!"); break;
//		case "b1":
//		case "B1":System.out.println("50만원 상품권 당첨!!"); break;
//		case "c1":
//		case "C1":System.out.println("10만원 상품권 당첨!!"); break;
//		default: System.out.println("꽝!");
//		}
		if(code.equals("a1")||code.equals("A1")) {
			System.out.println("100만원 상품권 당첨!!");
		}else if(code.equals("b1")||code.equals("B1")) {
			System.out.println("50만원 상품권 당첨!!");
		}else if(code.equals("c1")||code.equals("C1")) {
			System.out.println("50만원 상품권 당첨!!");
		}else {
			System.out.println("꽝!!");
		}
	}
}
