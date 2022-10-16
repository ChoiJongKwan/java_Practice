package day02_연산자;
/*
 * <증감연산자>
 * ++a a=a+1
 * --a a=a-1
 * 
 * ++,--기호가 앞에 있으면 연산식에서 증감된 값으로 연산하고 ++,-- 기호가 뒤에있으면 연산식에서 증감하지 않은 값으로 연산하고
 * 연산식이 끝나면 값을 증감한다
 */
public class test03 {
	public static void main(String[] args) {
		int a=10;
		int b=++a;
		int c=b++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println();
		int a1=10,b1=10,c1=10,d1=0,d2=0;
		d1=++a1+10;
		d2=b1++ +a1+c1--;
		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);
		System.out.println("c1:"+c1);
		System.out.println("d1:"+d1);
		System.out.println("d1:"+d2);
	}

}
