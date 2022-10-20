package day06;
/*
 * <생성자 -constructor>
 * -객체가 생성될때 자동으로 호출되는 메소드
 * -주로 맴버변수값을 초기화하려는 목적으로 만든다
 * -만드는 형식
 * 1.클래스명과 동일한 이름으로 메소드 이름을 만든다.
 * 2.리턴값을 갖을수 없으며 void를 적지 않는다
 */
class Font{
	private int fontSize;
	private String fontName;
	
	public Font() {
		System.out.println("생성자 호출!");
		fontSize=8;
		fontName="바탕체";
	}
	public void setFontSize(int fontSize) {
		this.fontSize=fontSize;
	}
	public void setFontName(String fontName) {
		this.fontName=fontName;
	}
	public void showFontInfo() {
		System.out.println("설정된 글꼴크기: "+fontSize);
		System.out.println("설정된 글꼴: "+fontName);
	}
}
public class Test04_생성자 {
	public static void main(String[] args) {
		Font font = new Font();
		font.showFontInfo();
		System.out.println();
		font.setFontSize(11);
		font.setFontName("궁서체");
		font.showFontInfo();
	}
}
