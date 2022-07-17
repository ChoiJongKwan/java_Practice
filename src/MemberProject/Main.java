package MemberProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		MemberManegement mm = new MemberManegement();
		Member mb= new Member();
//		System.out.println("------선언---------");
//		mm.newMember("최종관", 26, "010-1111-1111");
//		mm.newMember("홍길동", 30, "010-2222-2222");
//		mm.newMember("임꺽정", 20, "010-2222-2222");
//		mm.showMember();
//		System.out.println("------삭제---------");
//		mm.deleteMember("010-1111-1111");
//		mm.showMember();
//		System.out.println("------수정---------");
//		mm.updateMember("010-2222-2222", 22, "고길동");
//		mm.showMember();
		boolean run= true;
		while (run) {
			System.out.println("1.회원추가 2.회원삭제 3.회원수정 4.회원조회 9.종료");
			System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)>>");
			
			switch (choice) {
			case 1:
				System.out.println("회원가입을 원하는 회원의 이름,나이, 전화번호(010-xxxx-xxxx)를 입력하시오>>");
				String name = sc.nextLine();
				int age = sc.nextInt();
				String phoneNember = sc.nextLine();
				
				
				break;

			default:
				break;
			}
			
		}
	}
	

}
