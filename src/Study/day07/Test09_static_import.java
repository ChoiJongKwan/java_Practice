package day07;

import test.Calc;

public class Test09_static_import {
	public static void main(String[] args) {
		Member mem1= new Member("asdf", "1234");
		String id= mem1.getId();
		System.out.println("덧셈: "+Calc.add(7, 8));
	}
}
