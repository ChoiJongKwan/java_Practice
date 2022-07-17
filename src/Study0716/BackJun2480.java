package Study0716;

import java.util.*;


public class BackJun2480 {

	public static void main(String[] args) {
		
		int A = 0;//(int) (Math.random()*6)+1;// 주사위 눈값을 랜덤으로 받음
		int B = 0;// (int) (Math.random()*6)+1;
		int C = 0;//(int) (Math.random()*6)+1;
		Scanner s= new Scanner(System.in);
		int Dice[]=new int[3]; // 배열로 값을담아 마지막조건에서 사용할 값을찾기위해 Dice[]에 저장
		int money = 0;// 출력할 상금변수money 변수선언과 초기화
		
		for (int i=0; i<Dice.length;i++) {
			System.out.println("주사위 값을 입력해주세요");
			Dice[i]=s.nextInt();
			if (Dice[i]<1||7<=Dice[i]) {
				System.out.println("다시입력해주세요");
				i--;
			}
			
		}
		A = Dice[0];
		B = Dice[1];
		C = Dice[2];
		if (A==B&&B==C) {
			money=10000+(A*1000);
			
		}else if (A==B||B==C||A==C) {
			if(A==B)
				money=1000+(A*100);
			else if(A==C)
				money=1000+(A*100);
			else 
				money=1000+(B*100);
		}else {
			Arrays.sort(Dice); // 오름차순으로 정렬하여 가장큰값을 Dice[2]에 저장
			money=100*Dice[2];
		}
			
		System.out.println("나온 주사위값 = "+A +" "+B+" " +C);
		System.out.println("상금은 = "+money);
	}

}
