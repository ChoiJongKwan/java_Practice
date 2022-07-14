package Ch07;

public class Ex_7 {

	public static void main(String[] args) {
		Car car=null;
		FireEngine fe= new FireEngine();
		FireEngine fe2= new FireEngine();
		
		fe.water();
		car = fe;
		//car.water();   // car 타입에는 water()을 호출할수 있는게 없다.
		fe2= (FireEngine) car;
		fe.water();
		
	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("dirve Brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!!!!!!");
	}
	
}
class FireEngine extends Car{
	void water(){
		System.out.println("water!!!");
	}
}