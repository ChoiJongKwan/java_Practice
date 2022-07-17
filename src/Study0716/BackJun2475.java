package Study0716;

import java.util.*;
public class BackJun2475 {
	public static void main(String[] args) {
		Number nb = new Number();
		int[] number = new int[6];
		
		for(int i=0;i<5;i++) {
			number[i]=(int) (Math.random()*10);
		}
		number[5]= nb.square(number);
//		System.out.println(Arrays.toString(number));
		System.out.println(number[5]);
	}

	

}
class Number{
	int sum,num=0;
	
	int square(int[] number ) {
		for(int i=0;i<number.length-1;i++) {
			
			sum=sum+(number[i]*number[i]);
			System.out.println(sum);
		}
		num= sum%10;
		return num;
	}
	
}

