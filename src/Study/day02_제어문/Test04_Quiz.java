package day02_제어문;

import java.util.Scanner;

public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id="cjk";
		String pwd="1234";
		
		System.out.println("아이디 입력");
		String inputId=sc.next();
		System.out.println("비밀번호 입력");
		String inputPwd=sc.next();
		if(id.equals(inputId)&&pwd.equals(inputPwd)) {
			System.out.println("로그인 성공!~");
		}else {
			System.out.println("아이디 또는 패스워드가 다릅니다.");
		}
	}
}
