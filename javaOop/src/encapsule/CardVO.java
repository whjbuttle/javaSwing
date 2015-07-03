package encapsule;

public class CardVO {
	String msg;
	/*
	 카드의 가로와 높이는 모든 카드가 일정해야 한다(=고정값을 주어야 한다)
	 이는 상수로 선언해야한다는 뜻이다
	 상수 선언 문법 : final
	 */
	static final int WIDTH = 150;		//카드의 가로
	static final int HEIGHT = 300;		//카드의 높이

	public CardVO(String kind, int num) {
		this.msg = kind + ":" + num;
	}
	public String getMsg() {
		return msg;
	}
}
