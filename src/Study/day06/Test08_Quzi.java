package day06;
class Book{
	private int price;
	private String bookName;
	Book(){
		price=1000;
		bookName="마법천자문";
	}
	Book(int price,String bookName){
		this.bookName=bookName;
		this.price=price;
	}
	public void showBook(){
		System.out.println("책 제목:"+bookName);
		System.out.println("가격: "+price);
	}
	
}
public class Test08_Quzi {
	public static void main(String[] args) {
		Book book= new Book();
		book.showBook();
		Book book2= new Book(5000,"삼국지");
		book2.showBook();
	}
}
