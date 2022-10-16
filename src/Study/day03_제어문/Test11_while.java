package day03_제어문;
/*
 * [다중 while문]
 * 
 */
public class Test11_while {
	public static void main(String[] args) {
		int i=2;
		while(i<=9) {
			System.out.println(i+"단  "  );
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j) +" ");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}
