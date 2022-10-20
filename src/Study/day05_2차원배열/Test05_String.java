package day05_2차원배열;

import java.util.Scanner;

public class Test05_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[][] mems= {{"admin","김관리","010-111-1234"},{"user1","나회원","010-222-0000"},
		{"kimjava","김자바","010-333-111"}	};
		System.out.println("조회할 아이디입력");
		String inputid=sc.next();
		int cnt=-1;
		for(int i=0;i<mems.length;i++) {
			if(inputid.equals(mems[i][0])){
				cnt=i;
			}
		}
		if(cnt==-1) {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		}else {
			System.out.println("<조회된 결과>");
			System.out.println("아이디: "+mems[cnt][0]);
			System.out.println("이름: "+mems[cnt][1]);
			System.out.println("전화번호: "+mems[cnt][2]);
		}
		
		
		
	}
}
