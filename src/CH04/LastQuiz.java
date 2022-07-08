package CH04;

import java.security.SecurityPermission;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class LastQuiz {
	public static void main (String[] arg) {
//		 4-1 다음의 문장들을 조건식으로 표현하시오
//		 1. int형 변수 x가 10보다크고 20보다 작을때 true인 조건식
//		int x = 0;
//		if (x>10&&x<20)
//			System.out.println("정답");
//
//		2. char형 변수ch가 공백이나 탭이 아닐때 true인 조건식
//		char ch='a';			
//		if(!(ch==' '&&ch=='\t'))
//			System.out.println("정답");
//		3.char 변수 ch가 x또는 X일때 true인 조건식
//		if(ch=='x'&&ch=='X')
//			System.out.println("정답");
//		4.char형 변수 ch가 숫자 0~9일때 정답인 조건식
//		if('0'<=ch||ch<='9')
//			System.out.println("정답");
//		5.char형 변수 ch가 영문자(대문자 또는 소문자일때) 정답인 조건식
//		if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z'))
//			System.out.println("정답");
//		//6.int형변수 year가 400으로 나누어 떨어지거나 또는 4로떨어지고 100으로 나눠떨어지지 않을때 정답인 조건식
//		int year=400;
//		if(year%400==0||(year%4==0&&year%100!=0))
//			System.out.println("정답");
//		7.boolean형 변수 poweron 이 false일때 ture인 조건식
//		boolean powerOn = false;
//		if(powerOn==false)
//			System.out.println("정답");
//		8.문자열 참조변수 str이 yes일때 정답인 조건식
//		String str = "yes";
//		if(str.equals("yes"))
//			System.out.println("정답");
//
//
//		4-2 1부터 20까지의 정수중에서 2또는 3의 배수가 아닌수의 총합을 구하시오 
//		int sum=0;
//		for(int i=1;i<=20;i++) {
//			if(!(i%2==0||i%3==0)) {
//				sum+=i;
//			//	System.out.println(i);
//			}
//		}
//		System.out.println(sum);

		//4-3 1+(1+2)+(1+2+3)....+(1+2+3+4+5+6+7+8+9+10)의 결과를 구하시오
//		int sum2=0;
//		int num2=0;
//		for(int i=1;i<=10;i++) {
//			sum2=i+sum2;
//			num2+=sum2;
//		}
//		System.out.println(num2);
		//4-4 1+-2+3+4...과 같으식으로 더해갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오( 내가한 오답)
//		int sum3=0;
//		int num=0;
//		while(sum3<=100) {
//		if(num%2==0) {
//			sum3-=num;
//		}else if(num%2==1){
//			sum3+=num;
//		}
//		++num;
//		
//	}
//		System.out.println(num);
//		//4-4 1+-2+3+4...과 같으식으로 더해갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오(정답)
//
//		int sum = 0; // 총합을 저장할 변수
//		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
//		int num = 0;
//		// true . 조건식의 값이 이므로 무한반복문이 된다
//		for(int i=1;true; i++, s=-s) { // s 1, -1, 1, -1... 매 반복마다 의 값은
//		num = s * i; // i (s) . 와 부호 를 곱해서 더할 값을 구한다
//		sum += num;
//		if(sum >=100) // 100 . 총합이 보다 같거나 크면 반복문을 빠져 나간다
//		break;
//		}
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
		// 4-5 다음 for문을 while문으로 변경하시오
//		int i=0;
//		while(i<=10) {
//			int j=0;
//			while(j<=i) {
//				
//				System.out.print("*");	
//				
//				j++;
//
//			}
//			i++;
//			System.out.println();
//		}
		//4-6 두개의 주사위를 던졌을때 눈의 합이 6이되는 모든경우의수를 출력하는 프로그램을 작성하시오
//		for(int i=1;i<=6; i++) {
//			for(int j=6;j>=1;j--) {
//				if(i+j==6)
//					System.out.println(i+"+"+j+"=6");
//			}
//			
//			
//		}
//		//4-7 책확인
//		String str="12345";
//		int sum=0;
//		for(int i=0;i<str.length();i++) {
//	
//			sum+=(str.charAt(i)-'0');
//			System.out.println(sum);
//		}
//		//System.out.println(sum);
		//4-8 책확인
//		int value = (int) ((Math.random()*6)+1);
//		System.out.println(value);
		//4-9 책봐라
//		int num=12345,sum=0;
//		
//		while(num!=0) {
//			sum+=num%10;
//			num=num/10;
//		
//		}
//		System.out.println(sum);
		//4-10
		int answer = (int) ((Math.random()*100)+1);
		int input=0, count=0;
		
		Scanner scanner=new Scanner(System.in);
		do {
			count++;
			System.out.print("1~100사이의 정수를 입력해주세요:");
			input=scanner.nextInt();
			
			if(answer==input) {
				System.out.println("정답입니다");
				System.out.println("입력하신 횠수는"+count+"번 입니다.");
			break;}
			if(answer>input)
				System.out.println("좀더 큰값을 입력해주세요");
			if(answer<input)
				System.out.println("좀더 작은값을 입력해주세요");
			
		} while (true);
		
		
	}}
