package Ch07;
class SutdaDeck{
	final int CARD_NUM =20;	
	SutdaCard[] card = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<card.length;i++) {
			int num = i%10+1;
			boolean isKang =(i<10)&&(num==1||num==3||num==8);
			
			card[i] = new SutdaCard(num,isKang);
			
			
		}
		
		
	}
}
class SutdaCard{
	int num;
	boolean isKang;
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isking){
		this.num=num;
		this.isKang=isking;
	}
	public String toString () {
		return num+(isKang ? "k" : "");
	}
}
public class NQuiz_1 {
	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("hi");
	}

}
