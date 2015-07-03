package abstraction;

public class Card {
	
	static final int WIDTH = 150;		//카드의 가로
	static final int HEIGHT = 300;		//카드의 높이
	public static final String KIND = "하트";	
	// 코드의 단순화를 위해 KIND를 한 종류만 사용
	private int num;
	
	public Card() {
		this.num = (int) ((Math.random()*13)+1);
		// Math.random 메소드는 범위내에서 랜덤 숫자를 발생시키는 역할 
		// *13은 리미트 값, + 1은 스타트 값
	}
	public int getNum() {
		return num;
	}
}
