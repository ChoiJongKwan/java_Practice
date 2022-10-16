package day03_제어문;
//for문의 여려형태
//break ->for 문을 강제로 빠져나감
public class Test05_for {
	public static void main(String[] args) {
		char a='A';
		for(;a<='Z';) {
			System.out.println(a+" ");
			a++;
		}
		System.out.println();
		char b='a';
		for(;;) {
			System.out.println(b+ " ");
			b++;
			if(b>'z')
				break;
		}
		
	}
}
