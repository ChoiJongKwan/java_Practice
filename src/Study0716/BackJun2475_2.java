package Study0716;

public class BackJun2475_2 {
	public static void main(String[] args) {
		Tnum nb = new Tnum();
		int a= nb.square(0, 4, 2, 5, 6);

System.out.println(a);
	}

	

}
class Tnum{
	
	
	int square(int num1, int num2, int num3, int num4, int num5 ) {
	
	int sum = (num1*num1+num2*num2+num3*num3+num4*num4+num5*num5);
	int div = sum%10;
		return div;
	}
}

