package Ch07;

abstract class Player{// 추상 클래스 (미완성클래스, 미완성 설계도
	abstract void play(int pos);// 추상메서드 (미완성)
	abstract void stop();//추상메서드(선언부만 있고 구현부{}가 없는 메서드
}

class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 시작합니다.");}
	void stop() {System.out.println("재생정지");}
	}

public class Playtest {

	public static void main(String[] args) {
		//Player p =new Player();
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}
