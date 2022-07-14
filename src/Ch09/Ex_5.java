package Ch09;
class Card2{
	String kind;
	int number;
	Card2(){
		this("SPADE", 1);
	}
	Card2(String kind , int number){
		this.kind=kind;
		this.number=number;
	}
	public String toString() {
		return "kind :" + kind + " , number :"+ number;
	}
}
public class Ex_5 {

	public static void main(String[] args) {
		Card2 c11= new Card2();
		Card2 c22= new Card2("HEART", 9);
		
		System.out.println(c11.toString());
		System.out.println(c22.toString());

	}

}
