package encapsule;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로길이 입력: ");
		double width = scanner.nextDouble();
		System.out.println("세로길이 입력: ");
		double height = scanner.nextDouble();
		
		//double 타입의 파라미터에 int 타입의 값을 할당해도 아무 문제가 발생하지 않는 것은
		//자바 내부적으로 작은 타입은 큰 타입에 적용 가능하기 때문이다
		//다만 값의 손실은 피할 수 없다
		TriangleVO triangle = new TriangleVO(width, height);
		System.out.println("면적: " + triangle.getArea());
	}
}
