package day03_제어문;

import java.util.Scanner;

public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String id="asdf";
		String pwd="1234";
		
		for(;;) {
			System.out.println("id와 pwd를 입력해주세요");
			String inputid= sc.next();
			String inputpwd= sc.next();
			if(inputid.equals(id)&&inputpwd.equals(pwd)) {
				System.out.println("로그인성공!!");
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}
				
		
	
		
		
	}
}
