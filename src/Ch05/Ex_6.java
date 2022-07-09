package Ch05;

public class Ex_6 {

	public static void main(String[] args) {
		String[] names = {"kim","park","choi","son"};
		for(int i=0;i<names.length;i++) {
			System.out.println("name["+i+"]: "+names[i]);
		}
		String tmp = names[2];
		System.out.println("tmp:"+tmp);
		names[0]="ki";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}

}
