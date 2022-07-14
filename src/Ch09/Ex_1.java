package Ch09;

public class Ex_1 {

	public static void main(String[] args) {
		Value v1= new Value(10);
		Value v2= new Value(10);
		if(v1.equals(v2)) {
			System.out.println("주소가 일치합니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		if(v1.Vequals(v2)) {
			System.out.println("밸류가 일치합니다");
		}else {
			System.out.println("밸류가 다릅니다");
		}

	}

}
class Value{
	int value;
	Value(int value){
		this.value=value;
	}
	public boolean Vequals(Object obj) {
		if(!(obj instanceof Value)) return false;
	
	Value v = (Value) obj;
	return this.value==v.value;
	}
	
	
	
	
	
}