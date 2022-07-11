package Ch06;
class marin{
	int x=0,y=0;
	int hp=60;
	//static 추가 이유 모든 유닛들이 동일해야 하기 때문에
	static	int weapon=6; //static 추가
	static	int armor=0; //static 추가

	//static 추가이유 static 변수에 대한 변경이기때문에
	static	void weaponUp() {//static 추가
		weapon++;
	}
	static void armorUp() {//static 추가
		armor++;
	}

	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}


}
	
public class Quiz_7 {
// 다음은 컴퓨터 게임의 병사 를 클래스로 정의한 것이다 이 클래스의 멤버 (marine) .
//	다음중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가  ?
//	 단 모든 병사의 공격력과 방어력은 같아야한다
// geeee
	
	
	

}
