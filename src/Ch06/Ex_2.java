package Ch06;

import java.util.Scanner;


public class Ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tv t1= new Tv();
		Tv t2= new Tv();
		System.out.println("t1의 channel값은 "+t1.channel + "입니다");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다");
		System.out.print("변경하실 채널숫자를 입력해주세요>");
		int ch = sc.nextInt();

		t1.channel =ch;
		System.out.println("t1의 channel값을 "+ch+"으로 변경하엿습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel + "입니다");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다");
	}

}
