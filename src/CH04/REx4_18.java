package CH04;

import java.util.Scanner;

public class REx4_18 {

	public static void main(String[] args) {
		int menu =0, num=0;
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) Squar");
			System.out.println("(2) Squar root");
			System.out.println("(3) Log");
			System.out.print("원하는 메뉴(1~3)을 선택하세요.(0은 종료)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
			}else if (!(1<= menu && menu <=3)) {
				System.out.println("메뉴를 잘못선택하셨습니다.");
				continue;
			}
			
			
			System.out.println("선택하신 메뉴는 "+menu+"번 입니다");
			
		}
		
		
		

	}

}
