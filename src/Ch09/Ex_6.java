package Ch09;

public class Ex_6 {

	public static void main(String[] args) {
		String str1 ="abc";
		String str2 ="abc";
		System.out.println("String str1 =\"abc\";");
		System.out.println("String str2 =\"abc\";");
	
		System.out.println("Str1==str2 ?"+(str1==str2));
		System.out.println("Str1.equals(str2) ?"+(str1.equals(str2)));
		System.out.println();
		
		String str3 =new String("abc");
		String str4 =new String("abc");
		System.out.println("String str3 =\"abc\";");
		System.out.println("String str4 =\"abc\";");
	
		System.out.println("Str3==str4 ?"+(str3==str4));
		System.out.println("Str3.equals(str4) ?"+(str3.equals(str4)));
		System.out.println();
	
	
	
	
	
	}

}
