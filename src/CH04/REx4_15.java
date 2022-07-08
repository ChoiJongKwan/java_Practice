package CH04;

import java.util.Scanner;

public class REx4_15 {

	public static void main(String[] args) {
		int input =0, answer = 0;
		answer =(int) (Math.random()*100)+1; // 1~100사이의 난수발생
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1~100사이의 정수를 입력하시오>");
			input = scanner.nextInt();
			
			if (input>answer) {
				System.out.println("더 작은수로 다시시도해보세요 ");
			}else if (input<answer) {
				System.out.println("더 큰수로 다시시도해보세요 ");

			}
		
		} while (input!=answer);
		
		System.out.println("정답입니다~");
		
		
		
		
		
	}

}
