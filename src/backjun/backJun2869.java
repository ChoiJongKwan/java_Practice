package backjun;

import java.util.Scanner;

public class backJun2869 {
	public static void main(String[] args) {
//		땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
//		달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
//		또, 정상에 올라간 후에는 미끄러지지 않는다.
//		달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
		Scanner sc= new Scanner(System.in);
		int A,B,V,day = 1,sum=0;
		
		System.out.println("달팽이가 한번에 올라갈높이A, 밤에 미끄러질B 그리고 정상의 높이V를 입력하여 주세요");
		System.out.print("한번에 올라가는 높이 A>>");
		A=sc.nextInt();
		System.out.print("미끄러지는 높이 B>>");
		B=sc.nextInt();
		System.out.print("정상의 높이 V>>");
		V=sc.nextInt();
//		System.out.println(A+""+B+""+V);
		while(sum<V) {
			sum=sum+A;
			sum=sum-B;
			System.out.println(sum);
			if(sum>=V) break;
			day++;
		}
		System.out.println(day);
		

	}

}
