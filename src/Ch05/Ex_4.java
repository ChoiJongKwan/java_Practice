package Ch05;

import java.util.Arrays;

public class Ex_4 {

	public static void main(String[] args) {
		int[] numarr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numarr));
		
		for(int i=0;i<100;i++) {
			int n = (int) (Math.random()*10);
			int tmp = numarr[0];
			numarr[0]= numarr[n];
			numarr[n]=tmp;
		}
	System.out.println(Arrays.toString(numarr));
	// 스스로 하는 활용 로또번호 추첨기
	int[] roto=new int[7];
	
	for(int i=0;i<roto.length;i++) {
		int n = (int) (Math.random()*50)+1;
		roto[i]=n;
		
		
	}
	
	System.out.print("이번주의 로또번호는 "+Arrays.toString(roto)+" 입니다");
	
	
	
	
	
	
	}

}
