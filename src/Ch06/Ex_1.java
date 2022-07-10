package Ch06;


public class Ex_1 {

	public static void main(String[] args) {
	Tv t;
	t= new Tv();
	t.channel = 7;
	t.power();
	t.channelDown();
	t.channelDown();
	t.channelDown();
	t.channelDown();
	System.out.println("현재 채널은 "+t.channel+"입니다");
	System.out.println("현재 파워는 "+t.power+"입니다");

	}
	
	
	
	
}
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
	
	
}