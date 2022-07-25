package backjun;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class BackJun11047 {

	public static void main(String[] args) {
		int[] coin = {10,50,100,500,1000,5000,10000,50000,100000};
		Scanner sc = new Scanner(System.in);
		System.out.println("1.코인조회 2.코인의수계산 9.종료");
		System.out.println("원하는 기능의 번호를 누르세요 (종료는 9번)");
		boolean run = true;
		int count=0;
		while(run) {
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println(Arrays.toString(coin));
				break;

			case 2:
				System.out.println("계산하실 금액을 적어주세요");
				int price = sc.nextInt();
				for(int i = 0 ;price>=9;i++) {
					if((price-coin[8])>=1) {
						count+=1;
						price=price-coin[8];
					}else if((price -coin[7])>=1) {
						count+=1;
						price=price-coin[7];
					}else if((price -coin[6])>=1) {
						count+=1;
						price=price-coin[6];
					}else if((price -coin[5])>=1) {
						count+=1;
						price=price-coin[5];
					}else if((price -coin[4])>=1) {
						count+=1;
						price=price-coin[4];
					}else if((price -coin[3])>=1) {
						count+=1;
						price=price-coin[3];
					}else if((price -coin[2])>=1) {
						count+=1;
						price=price-coin[2];
					}else if((price-coin[1])>=1) {
						count+=1;
						price=price-coin[1];
					}else if((price-coin[0])>=1) {
						count+=1;
						price=price-coin[0];
					}else {
						price=0;
					}}
				System.out.println("필요한 코인수=" +count+" 남은 1의자리수= " + price);
				
				
				break;
			case 9:
				run=false;
				break;
			}
			
			
		}
		
		
		
		

	}

}
