package test01_변수;

/*
 * 변수
 * -변수 : 임의의 값을 저장하기 위해 메로리 상에 만들어 지는 공간
 * -만드는 형식
 *  자료형 변수명 = 초기값;
 * 예) int a=10;
 * -변수명 만드는 규칙
 * 1)일반적으로 소문자로 작성한다
 * 2)영문자,숫자,_를 사용할수 있다.
 * 3)예약어는 사용할수 없다.
 * 4)특수문자, 공백을 사용할수 없고 숫자로 변수명이 시작되면 안된다.
 * 
 * 
 * [자료형]
 * 1)기본자료형
 * 정수형: byte(1), short(2), int(4), long(8)
 * 상수형: double(8), float(4)
 * 부동형 : boolean(1)
 * 문자형: char(2)
 * 2)참조 자료형
 * 클래스, 배멸
 * 
 * 
 */
public class test02 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("두수합=>"+c);
		System.out.println(a+"+"+b+"="+ c);
		
		byte d=100;
		System.out.println("d:"+d);
		long e=111111111L;
		System.out.println("e:"+e);
		float f=3.5678f;
		System.out.println("f:"+f);
		double g=3.5678;
		System.out.println("g:"+g);
		boolean h=10<20;
		System.out.println("h:"+h);
		char ch='굳';
		System.out.println("ch:"+ch);
		String str="hello";
		System.out.println("str:"+str);
	}

}
