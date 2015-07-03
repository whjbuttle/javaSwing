package encapsule;

public class RectangleVO2 {
	private int width, height, area;
	
	public RectangleVO2(int width, int height) {
		this.area = width * height;
	}

	public RectangleVO2() {
		// TODO Auto-generated constructor stub
	}

	public int getArea() {
		return area;
	}
}
