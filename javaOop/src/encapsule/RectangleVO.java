package encapsule;

public class RectangleVO {
	private int width, height, area;
	
	//생성자 자동완성 단축키 : 필드 선언 종료 직후 CTRL + space
	public RectangleVO() {
		// 이것을 디폴트 생성자라고 하며 파라미터가 없는 것이 특징
		// 이것이 보이지 않는다 하더라도 내부적으로는 완성되어있다.
		// PayVO 역시 내부적으로는 파라미터 없는 생성자가 만들어져 있다.
		// 이것을 호출(call)한 이유는 생성자를 여러개 만들어서 사용하려고 하기 위함이다. (생성자 오버로딩)
		// 오버로딩을 쉽게 하는 단축방법 :
		this(0, 0);
	}

	public RectangleVO(int width, int height) {
		this.area = width * height;
	}

	public int getArea() {
		return area;
	}

	
}
