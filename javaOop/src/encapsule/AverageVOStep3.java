package encapsule;
/*
 Date: 20150618
 Author: itbank
 Story: 은닉화에 대한 예제
 		은닉화란 필드에 있는 데이터 값을 아무나 접근하지 못하게 하고 setter와 getter를 통해 권한(퍼미션)을 획득한 개체만 데이터에 접근하도록 하는 개념이다
 */

 /*
  접근제한자 private
  - 보안성이 향상됨. 컴포넌트의 독립성이 보장됨
  - 컴포넌트간 간섭을 최소화하여 독립성을 유지할 수 있음
  - 데이터 은닉
  */

public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	/*
	 필드에 있는 값들은 누구나 접근 및 데이터 수정이 가능하면 안 되기 때문에(보안상의 문제) 기능을 분리하여 읽기와 쓰기 기능으로 나눈다
	 읽기를 get~(), 쓰기를 set~() 로 한다. 이클립스는 필드값에 대한 메소드 이름 주는 것을 자동화 했다 getter(읽기기능), setter(쓰기기능)
	 단축키: ALT + SHIFT + s 에서 generate getter and setter 를 선택한다
	 */
	
	/*
	 객체 지향 언어
	 4대 특징 (문법)
	 1. 은닉화 (encapsulation) => getter / setter
	 2. 상속 (inheritance) => extends
	 3. 추상화 (abstraction) => implements
	 4. 다형성(polymorphism) => 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getTot() {
		return tot;
	}

	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
		//자동으로 이클립스를 통해서 메소드명, 리턴타입, 파라미터를 생성한 후 필요에 따라 수정
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = tot/2;
	}

	
}
