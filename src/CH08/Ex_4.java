package CH08;

public class Ex_4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticExption");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
