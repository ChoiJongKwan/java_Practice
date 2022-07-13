package CH08;

public class Ex_5 {

	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3);
	//	System.out.println(4/0);
		System.out.println(args[1]);
		System.out.println(4);
	} catch (ArithmeticException ae) {
		// TODO: handle exception
		ae.printStackTrace();
		System.out.println("예외메세지 : "+ae.getMessage());
	}	catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
System.out.println(6);
	}

}
