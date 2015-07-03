package abstraction;

public class ProductSpec implements Product{

	private String company;		// 제조사
	private String name;		// 제품명
	private String serialNo;	// 일련번호
	
	@Override
	public void setInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	@Override
	public void getInfo() {
		System.out.println("제조사 : " + this.company);
		System.out.println("제품명 : " + this.name);
		System.out.println("시리얼넘버 : " + this.serialNo);
	}

}

// 이클립스 단축키 사용자 정의 방법
// 메뉴바 > Window > preference > general > keys > copy line 입력 > CTRL + J
// 메뉴바 > Window > preference > general > keys > delete line 입력 > CTRL + D
// 메뉴바 > Window > preference > general > keys > delete line 입력 > CTRL + B
// 메뉴바 > Window > preference > general > keys > delete line 입력 > CTRL + F