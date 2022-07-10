package Ch06;

public class Quiz_16 {

	
		public static void change(String str) {
		str += "456";
		}
		public static void main(String[] args)
		{
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
		}
		}


//change    메서드의 매개변수가 참조형인데도 왜? main메서드의 문자열 str에 변경한
//내용이 반영되지 않은 것일까 많은 사람들이 매개변수가 참조형이라는 것만 보고 main메서드의 str문자열이 
//변경될 것이라고 쉽게 생각한다 누구라도 실수하기 쉬운 부분이므로 주의하길 바라는 마음에서 이 문제를 만들었다.
//그림과 함께 단계 별로 설명하면 어렵지 않게 이해할 수 있을 것이다.
//처음에 str문자열을 참조변수 에 저장하면 아래와 같은 그림이 된다  .
//그 다음에 메서드change 를 호출하면서 참조변수 str 을 넘겨주면 메서드 change의 지역   , 
//변수 str에 주소값 0x100이 저장된다 이제 메서드 change의 지역변수 str도 문자열   .  
//"ABC123" . . 을 참조하게 된다 이 두 참조변수는 이름은 같지만 분명히 다른 변수 이다 서
//로 다른 영역에 존재하기 때문에 이름이 같아도 상관없는 것이다
//change(str); // change str 
//메서드 에서는 넘겨받은 문자열의 뒤에 을 붙인다 문자열은 내용을 변경할 change "456" .
//수 없기 때문에 덧셈연산을 하면 새로운 문자열이 생성되고 새로운 문자열의 주소가 변수
//str 에 저장된다.
//public static void change(String str) {
//str += "456"; // "456" . 기존의 문자열에 을 붙인다
//}
//이제 change메서드는 종료되고 작업에 사용하던 메모리를 반환하므로 change메서드의 지  , 
//역변수인 str역시 메모리에서 제거된다 다시 main메서드로 돌아와서 문자열 str의 값을  .  
//출력하면 처음의 값과 변함없는 값이 출력된다 문자열 "ABC123456"은 참조하는 변수가 . 
//하나도 없으므로 적절한 시기에 가비지컬렉터(garbage collector) 에 의해 제거된다  .
