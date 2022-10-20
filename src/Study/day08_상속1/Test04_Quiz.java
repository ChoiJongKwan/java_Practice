package day08_상속1;
class HandPhone{
	private String phoneNum;
	
	public HandPhone(String phoneNum) {
		this.phoneNum=phoneNum;
	}
	
	public void call() {
		System.out.println("내 핸드폰 번호:"+phoneNum);
		System.out.println("전화 걸기...........");
	}
	
}


class Dicaphone extends HandPhone{
	private int pixel;
	public Dicaphone(String phoneNum,int pixel) {
		super(phoneNum);
		this.pixel=pixel;
	}
	public void picture() {
		System.out.println(pixel+"만 화소로 사진찍기!!");
		System.out.println("촬영중......");
	}
	
}
public class Test04_Quiz {
	public static void main(String[] args) {
		Dicaphone dp = new Dicaphone("010-1111-1111", 10000000);
		dp.picture();
	}
}
