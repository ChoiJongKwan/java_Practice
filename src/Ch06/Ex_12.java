package Ch06;
class car{
	String clolr;
	String gearType;
	int door;
	car(){}
	
	car(String c, String g, int d){
		clolr =c;
		gearType=g;
		door=d;
	}
	
	
}
public class Ex_12 {

	public static void main(String[] args) {
		car c1=new car();
		c1.clolr="black";
		c1.gearType="auto";
		c1.door=4;
		car c2= new car("red","auto",2);
		System.out.println(c1.clolr+","+c1.gearType+","+c1.door);
		System.out.println(c2.clolr+","+c2.gearType+","+c2.door);
		
		
		
	}

}
