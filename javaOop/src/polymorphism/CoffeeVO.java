package polymorphism;

public class CoffeeVO {
	private String msg;
	int price, money;
	
	public CoffeeVO() {
		this.msg = "커피 자판기입니다.";
	}
	public CoffeeVO(int price){
		/*
		 this.price는 위쪽 필드에 선언된 인스턴스변수이고
		 = price 에 있는 값은 생성자 메소드에 파라미터로 넣어 온 값이다.
		 따라서 아래 구문은 인스턴스변수에 파라미터 값을 할당한다는 의미이다.
		 */
		this.price = price;
		this.msg = "한 잔에 " + price + " 원 입니다.";
	}
	public CoffeeVO(int price, int money, String coffee) {
		this.msg = coffee + " 나왔습니다.\n거스름돈은 "+ (money-price) +"원 입니다.";
	}
	public String getMsg() {
		return msg;
	}
}
