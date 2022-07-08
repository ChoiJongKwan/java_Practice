package CH04;

import java.util.Scanner;

public class Ex4_11 {
	public static void main(String[] arg)  {
		System.out.println("당신의 주민등록번호를 입력해주세요.(111111-1111111)");
		Scanner scanner = new Scanner(System.in);
		String regN0 = scanner.nextLine();
		char gender=regN0.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("2000년도 이전 출생자 남자 입니다");
				break;

			case '3':
				System.out.println("2000년도 이후 출생자 남자 입니다");

				break;
			}
			break;
			case '2': case '4':
				switch (gender) {
				case '2':
					System.out.println("2000년도 이전 출생자 여자 입니다");
					break;

				case '4':
					System.out.println("2000년도 이후 출생자 여자 입니다");

					break;
				}
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
			break;
		}


	}
}
