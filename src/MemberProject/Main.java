package MemberProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		int age = 0;
		String phoneNember; 
		MemberManegement mm = new MemberManegement();
		Member mb= new Member();
//		

		mm.newMember("최종관", 26, "010-1111-1111");
		mm.newMember("홍길동", 30, "010-2222-2222");
		System.out.println("1.회원추가 2.회원삭제 3.회원수정 4.회원조회 9.종료");
		System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");
		
		boolean run= true;
		while (run) {
			int choice = sc.nextInt();
			
			
			
			switch (choice) {
			case 1:
				System.out.println("회원가입을 원하는 회원의 이름,나이, 전화번호(010-xxxx-xxxx)를 입력하시오>>");
				sc.nextLine();
				name = sc.nextLine();
				age = Integer.parseInt(sc.nextLine());	
				phoneNember = sc.nextLine();
				mm.newMember(name, age, phoneNember);
				System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");
				break;
				
				case 2: 
					System.out.println("삭제하고싶은 회원의 전화번호를 입력하시오");
					sc.nextLine();
					phoneNember = sc.nextLine();

				mm.deleteMember(phoneNember);
				System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");

				break;
				
				case 3:
					System.out.println("수정하고싶은 회원의 전화번호를 입력하세요");
					sc.nextLine();
					phoneNember = sc.nextLine();
					System.out.println("수정할 이름을 적어주세요(미변경시 기존이름)");
					name = sc.nextLine();
					System.out.println("변경하실 나이를 적어주세요(미변경시 기존나이)");
					 age = sc.nextInt();
					
					mm.updateMember(phoneNember, age, name);
					System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");

					break;
					
				case 4: 
					System.out.println("회원을 조회합니다.");
					mm.showMember();
					System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");

					break;
			case 9:
				run = false;
				break;
			}
			
		}
	}
	

}
//System.out.println("------선언---------");

//mm.newMember("임꺽정", 20, "010-2222-2222");
//mm.showMember();
//System.out.println("------삭제---------");
//mm.deleteMember("010-1111-1111");
//mm.showMember();
//System.out.println("------수정---------");
//mm.updateMember("010-2222-2222", 22, "고길동");
//mm.showMember();
