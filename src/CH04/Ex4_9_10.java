package CH04;
import java.util.*;

import javax.swing.text.GapContent;

public class Ex4_9_10 {

	public static void main(String[] args) {
		char grade = ' ';
		System.out.print("당신의 점수를 입력하세요 (1~100)>");	
		Scanner scanner = new Scanner(System.in);
		int score ;
		String tep = scanner.nextLine();
		score = Integer.parseInt(tep);
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'c';
			break;	
			
		default:
			grade = 'F';
			break;
		}
System.out.println("당신의 학점은 " +grade+"입니다");


	}

}
