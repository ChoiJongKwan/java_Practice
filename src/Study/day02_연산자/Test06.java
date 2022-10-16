package day02_연산자;
/*
 * <강제형변환>
 * 
 * 데이터형식을 강제로 변환시키는것
 * (바꿀자료형)변수
 * (바꿀자료형)상수
 */
public class Test06 {
	public static void main(String[] args) {
		int a=(int) 4.5;
		System.out.println("a:"+a);
		byte b =100;
		System.out.println("b:"+b);
		int c=100;
		byte d=(byte) c;
		System.out.println("d:"+d);
		int e=d;
		char ch3 ='A';
		char ch=65;
		System.out.println("ch:"+ch);
		System.out.println("ch+1:"+(char)(ch+1));
		int f=67;
		char ch1=(char) f;
		System.out.println(ch1);
	}
}
