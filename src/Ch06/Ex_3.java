package Ch06;

public class Ex_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1= new Card();
		c1.kind = "Heart";
		c1.nember=7;
		
		Card c2= new Card();
		c2.kind = "Spade";
		c2.nember=2;
		System.out.println("c1은 "+c1.kind +","+c1.nember+"이며 크기는("+Card.width+","+Card.height+")");
		System.out.println("c2은 "+c2.kind +","+c2.nember+"이며 크기는("+Card.width+","+Card.height+")");
		System.out.println("c1의 width 와 height를 각각 50,80으로 변경합니다");
		Card.width =50;
		Card.height =80;
		System.out.println("c1은 "+c1.kind +","+c1.nember+"이며 크기는("+Card.width+","+Card.height+")");
		System.out.println("c2은 "+c2.kind +","+c2.nember+"이며 크기는("+Card.width+","+Card.height+")");
	}
	}
class Card{
	String kind;
	int nember;
	static int width =100;
	static int height=250;

}
