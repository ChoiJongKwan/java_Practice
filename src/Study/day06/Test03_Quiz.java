package day06;

import java.util.Scanner;

class Arae{
	private int x;
	private int y;
	private int arae;
	
	public void araeMake() {
		Scanner sc= new Scanner(System.in);
		System.out.println("x를 입력하세요");
		x=sc.nextInt();
		System.out.println("y를 입력하세요");
		y=sc.nextInt();
		arae=x*y;
		System.out.println("arae: "+arae);
	}
	
}
public class Test03_Quiz {
	public static void main(String[] args) {
		Arae a= new Arae();
		a.araeMake();
	}
}
