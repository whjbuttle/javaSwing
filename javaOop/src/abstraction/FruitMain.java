package abstraction;

public class FruitMain {
	public static void main(String[] args) {
		/*
		 인터페이스는 객체를 만들 수 없다
		 즉 FruitInterface f = new FruitInterface();
		 이것은 에러를 발생시킨다.
		 */
		
		FruitInterface apple = new AppleImpl();
		// 이처럼 타입정의만 인터페이스로 하고 생성자메소드는 인터페이스를 구현한 클래스를 가지고 객체를 생성한다 ★★★★★
		
		// AppleImpl apple2 = new AppleImpl();
		// 에러는 뜨지 않지만 위처럼 코딩하면 안 됨
		
		apple.display("맛있는");
		FruitInterface banana = new BananaImpl();
		banana.display("오래된");
		FruitInterface orange = new OrangeImpl();
		orange.display("비싼");
		
		// orange 클래스에 있는 getCount() 를 호출하고 싶다
		// orange.getCount();	에러가 남. 정의는 되어있지만 호출이 되지 않는다
		
		// 위처럼 되는 이유는 주어진 역할만 수행하라는 뜻
	}
}
