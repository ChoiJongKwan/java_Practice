package Ch06;
class car2{
	String color;
	String gearType;
	int door;
	
	car2(){
		this("white", "auto",4);
	}

	car2(String color){
		this(color,"auto",4);
	}
	
	car2(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}



public class Ex_13 {

	public static void main(String[] args) {
		car2 c1=new car2();
		car2 c2=new car2("blue");
		
		System.out.println("c1의 color= "+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c1의 color= "+c2.color+", gearType="+c2.gearType+", door="+c2.door);
	}

}
