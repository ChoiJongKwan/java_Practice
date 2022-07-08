package CH04;

import java.util.Scanner;

public class REx4_14 {

	public static void main(String[] args) {
		int num =0;
		int sum =0;
		System.out.print("숫자를 입력하시오.(예: 12345)>");
		Scanner scanner = new Scanner(System.in);
		String tem = scanner.nextLine();
		num = Integer.parseInt(tem);
		//System.out.println(num);
		
		while(num!=0) {
			sum+=num%10; //sum에 마지막자리 숫자를 더함
			System.out.printf("sum = %3d num = %3d\n",sum,num);
			
			num/=10;		//num의 마지막자리를 날림
		}
		


		System.out.println("각자리수의합 = "+ sum);
	}

}
