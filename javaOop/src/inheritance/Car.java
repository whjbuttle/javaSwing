package inheritance;

public class Car {
	/*
	 static 은 Car.CAR 로 호출 가능하게 클래스변수로 만드는 키워드
	 final 은 "자동차" 를 바꿀 수 없도록 하는 상수 키워드
	 */
	public static final String CAR = "자동차";
	private String companyName;	// 변수이기 때문에 값을 할당하지 않음
	
	public Car() {
		
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
}
