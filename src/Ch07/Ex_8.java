package Ch07;

class Product{
	int price, bounsPoint;   //가격과 보너스 포인트
	Product(int prince){
		this.price=prince;
		bounsPoint=(price/10);// 보너스포인트는 가격의 10%
	}
}
class Tv1 extends Product{
	Tv1(){
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);  // tv의 가격을 100으로 설정한다
	}
	//Object 클래스의 toString를 오버라이딩한다
	public String toString() {return "Tv";}
}
class computer extends Product{
	computer(){
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(200);  // computer의 가격을 200으로 설정한다
	}
	//Object 클래스의 toString를 오버라이딩한다
	public String toString() {return "computer";}
}
class notebook extends Product{
	 notebook() {
		super(300);
	}
	 public String toString() {return "notebook";}
}

class Buyer{
	int money=1000 , bounsePoint=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 모자랍니다");
			return;
		}
		money-=p.price;
		bounsePoint+=p.bounsPoint;
		System.out.println(p+"를 구매하였습니다.");
		
	}
	
}

public class Ex_8 {
	public static void main(String[] args) {
		Buyer b =new Buyer();
		b.buy(new Tv1());
		b.buy(new Tv1());
		b.buy(new computer());
		b.buy(new notebook());

		System.out.println(" 현재 남으신 금액은 "+ b.money +"입니다.");
		System.out.println(" 현재 보너스포인트는 "+ b.bounsePoint +"입니다.");
	}

}
