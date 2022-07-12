package Ch07;
public class NEx_10 {
	public static void main(String[] args) {
		Unit[] group= {new Marin(), new Tank(), new Dropship()};
		for(int i=0;i<group.length;i++) {
			group[i].move(100,200);
		}
	((Marin) group[0]).stimpack();
	((Tank) group[1]).ChangeMode();
	}

}
abstract class Unit{
	int x,y;
	abstract void move(int x,int y);
	void stop(){}
}

class Marin extends Unit{
	void move(int x, int y) {
		System.out.println("Marin[x="+x+", y="+y+"]");
	}
	 void stimpack() {System.out.println("스팀팩을 사용합니다.");}
}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
	}
	void ChangeMode() {System.out.println("공격모드 변경");}
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+", y="+y+"]");
	}
	void load() {}
	void nuload() {}
}