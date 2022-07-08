package CH04;
import java.util.*;

public class Ex4_7 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하시오");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); //사용사의 숫자를 유저에 저장
		int com = (int) (Math.random()*3) +1; // 1,2,3 중에 하나가 com에 저장됨
		System.out.println("당신은"+user + "입나다");
		System.out.println("컴퓨터는"+com + "입나다");
	
		switch (user-com) {
		case 2: case -1:
			System.out.println("당싱이 졋습니다");
			break;
		case 1: case -2:
			System.out.println("당싱이 이겼습니다");
			break;
		case 0 :
			System.out.println("비겼습니다.");
			break;
		}
		
	
	}

}
