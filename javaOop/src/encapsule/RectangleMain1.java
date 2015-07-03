package encapsule;

import java.util.Scanner;

public class RectangleMain1 {
	public static void main(String[] args) {
		System.out.println("가로길이를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();
		//rectangle.setWidth(scanner.nextInt());
		System.out.println("세로길이를 입력하세요");
		//별도로 지역변수(로컬변수)를 전언하지 않는 이유는 인스턴스를 통한 인스턴스 변수를 이용하기 때문이다.
		//rectangle.setHeight(scanner.nextInt());
		//rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("사각형의 면적 : " + rectangle.getArea());
	}
}
