package day06;
class Font1{
	private int fontSize;
	private String fontName;
	
	public Font1() {
		System.out.println("생성자 호출!");
		fontSize=8;
		fontName="바탕체";
	}
	public Font1(int fontSize, String fontName) {
		this.fontSize= fontSize;
		this.fontName=fontName;
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
public class Test05 {
	public static void main(String[] args) {
		Font1 f1= new Font1();
		f1.showFontInfo();
		Font1 f2=new Font1(20,"궁서체");
		f2.showFontInfo();
	}
}
