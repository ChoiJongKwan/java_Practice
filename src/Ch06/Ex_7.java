package Ch06;
class Data2 {int x;}
public class Ex_7 {

	public static void main(String[] args) {
		Data2 d= new Data2();
		d.x=10;
		System.out.println("main():x = "+d.x);
		change(d);
		System.out.println("after change ");
		System.out.println("main():x = "+d.x);

		
	}
static void change(Data2 d) {
	d.x =10000;
	System.out.println("change():x = "+d.x);

}
}
