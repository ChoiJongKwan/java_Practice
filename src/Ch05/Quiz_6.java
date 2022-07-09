package Ch05;

import java.util.Scanner;


public class Quiz_6 {

	public static void main(String[] args) {
		String[] words= {"텔레비전","컴퓨터","마우스","스마트폰"};
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<words.length;i++) {
			char[] question = words[i].toCharArray(); // string를 char로 변환
			for(int j=0;j<question.length;j++) {
				int ran=(int) (Math.random()*question.length);
				
				char tmp =question[i];
				question[i] = question[ran];
				question[ran] = tmp;
			}
				System.out.printf("Q%d. %s의 정답을 입력하세요>",i+1,new String(question));
				String answer = scanner.nextLine();
				
				if(words[i].equals(answer.trim()))
					System.out.println("정답입니다~\n\n");
					else {System.out.println("틀렷습니다.\n\n");
						
					
				
			}
			
			
			
		}
	
	
	
	
	}
}
