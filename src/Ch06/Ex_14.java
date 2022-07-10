package Ch06;

public class Ex_14 {
	static {   //클래스 초기화 블록
		System.out.println("static{}");
	}
	{
		System.out.println("{  }");
	}
	
	public Ex_14() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		System.out.println("Ex_14 bt= new Ex_14(); ");
		Ex_14 bt = new Ex_14();
		
		System.out.println("Ex_14 bt2= new Ex_14(); ");
		Ex_14 bt2 = new Ex_14();

		
	}

}
