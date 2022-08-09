package backjun;

import java.io.IOException;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		
		Solution sl = new Solution();
		int num=0;
		Scanner sc= new Scanner(System.in);
		num =sc.nextInt();
	

		System.out.println(	sl.solution(num));
	}




	
}
class Solution {
    public String solution(int num) {
         String answer = "";
        if(num%2==0)
           answer = "Even";
        else{
            answer= "Odd";
        }
        return answer;
    }

}