package day07;
class Book{
	private int price;
	private String bookName;
	Book(){
		price=1000;
		bookName="마법천자문";
	}
	Book(String bookName,int price){
		this.bookName=bookName;
		this.price=price;
	}
	public void showBook(){
		System.out.println("책 제목:"+bookName);
		System.out.println("가격: "+price);
	}
	
}
public class Test02_Quiz {
	public static void main(String[] args) {
		Book[] b= new Book[5];
		b[0]=new Book("삼국지",5000);
		b[1]=new Book("초한지",6000);
		b[2]=new Book("칼의노래",7000);
		b[3]=new Book("자바의 정석",15000);
		b[4]=new Book("마음의소리",4000);
		
		for(int i=0;i<b.length;i++) {
			b[i].showBook();
			System.out.println();
		}
	}
}
