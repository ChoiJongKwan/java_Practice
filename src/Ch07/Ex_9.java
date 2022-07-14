package Ch07;
class Product2{
	int price,bonusPoint;
	Product2(int price){
		this.price = price;
		bonusPoint=(int)(price/10.0);
	}
	Product2(){}
}
class Tv2 extends Product2{
	Tv2(){super(100);}
	public String toString() {return "Tv";}
}

class computer2 extends Product2{
	computer2(){super(200);}
	public String toString() {return "computer";}
}


class Audio2 extends Product2{
	Audio2(){super(50);}
	public String toString() {return "Audio";}
}
class Buyer2{
	int money=1000,bonusPoint=0;
	Product2[] cart=new Product2[10];
	int i=0;
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 모자랍니다");
			return;
		}
		
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p;
		System.out.println(p+"를 구매하셨습니다.");
	}
	void summary() {
		int sum=0;
		String itemList = "";
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum+= cart[i].price;
			itemList+=cart[i]+",";
		}
		System.out.println("구입하신 물품의 총금액은 "+ sum+"입니다.");
		System.out.println("구입하신 제품은 "+ itemList+"입니다.");
	}
	
}


public class Ex_9 {
	public static void main(String[] args) {
		Buyer2 b= new Buyer2();
		b.buy(new Tv2());
		b.buy(new computer2());
		b.buy(new Audio2());
		b.summary();
		System.out.println(b.bonusPoint);
	}

}
