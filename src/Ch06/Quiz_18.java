package Ch06;

public class Quiz_18 {

	public static boolean Isnumber(String str) {
		if(str==null || str.equals(""))
			return false;
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);     //<<스트링 하나하나를 char로 변환하여 비교
			if(ch < '0' || ch > '9') {
				return false;
			}
		} // for
		return true;
	}

	
	public static void main(String[] args) {
		// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
		String str="123";
		System.out.println(str+"는 숫자입니까?"+Isnumber(str));
		str="1234o";
		System.out.println(str+"는 숫자입니까?"+Isnumber(str));
	}

}
