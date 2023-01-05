package enum01;
//Enum : 열거 타입
//열거한 데이터만 쓸 수 있습니다.
//같은 값은 가질 수 없습니다.
//enum은 클래스명하고 중복할 수 없습니다.

enum Week{ //이중의 하나 쓰라고 고정해 두는 것 , 사용자가 많을 때는 사용 불가.. 사용자의 입력범위를 제어하고 그 안에서 움직이게 할때 씀
	MOM, TUE, WEN, THU, FRI, SET, SUN;
}


public class Enum01 {
	public static void main(String[] args) {
		Week week = Week.FRI;
		//String se = Week.FRI; //데이터 타입이 달라 사용 불가
		
		var number =10; //java 10 버전에 도입된 변수 var
		//값으로 데이터타입을 추론합니다. 지역변수로만 가능
		//꼭 초기화 후 사용, null초기화 안 됨, 배열 사용 불가
		System.out.println(number);
		
		var name = "홍길동";
		String str = name;
		
		
		
	}
	//static final String mon = "월요일";

}
