package Ch07;
class Tv{
	boolean power;
	int channel;
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
}



public class Ex_1 {
	public static void main(String[] args) {
		SmartTv smt= new SmartTv();
		smt.channel =10;
		smt.channelUp();
		System.out.println(smt.channel);
		smt.displayCaption("hello world");
		smt.caption=true;
		smt.displayCaption("hello, world");
		smt.displayCaption("hello, world");
	}

}
