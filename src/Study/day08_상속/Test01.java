package day08_상속;
/*
 * [상속]
 * -기본클래스(부모클래스,super클래스)의 속성과 메소드를 물려받고 기존의 기능을 수정하거나 새로운기능을 추가하는것
 * 형식
 * class 부모클래스{
 * ...
 * }
 * class 자식클래스 extends 부모클래스{
 *...'
 *}
 */
class HandPhone{
	private String phoneNum;
	public void setPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
		
	}
	
	public void call() {
		System.out.println("내 핸드폰 번호:"+phoneNum);
		System.out.println("전화 걸기...........");
	}
	
}

class Dicaphone extends HandPhone{
	private int pixel;
	public void setPixel(int pixel) {
		this.pixel=pixel;
	}
	
	public void Picture() {
		System.out.println(pixel+"만 화소");
		System.out.println("사진찍기");
	}
	
}


public class Test01 {
	public static void main(String[] args) {
		Dicaphone dp= new Dicaphone();
		dp.setPhoneNum("01011112222");
		dp.setPixel(10000000);
		dp.call();
		dp.Picture();
		
	}
}
