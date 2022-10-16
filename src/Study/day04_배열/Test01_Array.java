package day04_배열;
/*
 * [ 배열]
 * 같은자료형의 변수가 여러개 필요한 경우 연속적인 공간에 데이터를 나열해서 저장하고 첨자로 구분하는 자료구조
 * 1) 1차원배열
 * -점자가 하나인 배열
 */
public class Test01_Array {
	public static void main(String[] args) {
//		int[] a= new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		int[] a= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
}
