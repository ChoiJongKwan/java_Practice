package CH04;

import java.util.Scanner;

public class REx4_20 {
	public static void main(String[] args) {
		int menu =0, num=0;
		Scanner scanner= new Scanner(System.in);
		outer:
		while(true) {
			System.out.println("(1) Squar");
			System.out.println("(2) Squar root");
			System.out.println("(3) Log");
			System.out.print("원하는 메뉴(1~3)을 선택하세요.(0은 종료)>");
			
			String tmp = scanner.nextLine(); // tmp에 입력받은 내용저장
			menu = Integer.parseInt(tmp);	// 저장받은내용 int형태로 menu에 반환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
			}else if (!(1<= menu && menu <=3)) {
				System.out.println("메뉴를 잘못선택하셨습니다.");
				continue;
			}
			
			for(;;) {
				System.out.print("계산할 값을 입력하세요(계산종료 : 0, 전체종료 : 99)>");
				tmp = scanner.nextLine(); // tmp에 입력받은 내용저장
				num = Integer.parseInt(tmp);	// 저장받은내용 int형태로 menu에 반환
				if(num==0)
				break;
				if(num==99)
				break outer;
				
				switch (menu) {
				case 1:
					System.out.println("result="+ num*num);
					break;
				case 2:
					System.out.println("result="+ Math.sqrt(num));
					break;
				case 3:
					System.out.println("result="+ Math.log(num));
					break;
				}//switch의 종료
			}// for 의 종료
	}// while 의 종료
	}// 메인의 종료
}
