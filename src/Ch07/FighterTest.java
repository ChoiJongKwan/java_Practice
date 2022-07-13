package Ch07;

abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춰!");}
}

interface Fighterable{
	void move(int x, int y);// public abstract가 생략됨
	void attack(Fighterable f);// public abstract가 생략됨
}

class fighter extends Unit2 implements Fighterable{
// 오버라이딩 규칙: 조상(public) 보다 접근제어저가 범위가 좁으면 안된다
	public void move(int x, int y){
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fighterable f){
		System.out.println(f +"를 공격");
		
	}
 Fighterable getFighterable() {
	 fighter f = new fighter();
	 return f;
 }}

public  class FighterTest {
	public static void main(String[] args) {
		//Unit2 f1= new fighter();   // unit2에는 어택이 없다
		fighter f =new fighter();
		f.move(100,200);
		Fighterable f2 = new fighter();
		f2.move(200,200);
		
		f.attack(f2);
	}

}
