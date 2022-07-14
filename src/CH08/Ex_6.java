package CH08;

public class Ex_6 {

	public static void main(String[] args) {
	try {
		Exception e = new Exception("고의로 발생한 에러");
		throw e;
	} catch (Exception e) {
		System.out.println("에러메세지 : "+e.getMessage());
		e.printStackTrace();
	}
	System.out.println("프로그램 정상 종료 완료");
	}

}
