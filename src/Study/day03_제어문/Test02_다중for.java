package day03_제어문;
/*
 * [다중 for문]
 * 형식
 * for(초기식;조건식;증감식){
 * 
 * 		for(초기식;조건식;증감식){
 * 		수행할문장
 * }
 * }
 */
public class Test02_다중for {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
