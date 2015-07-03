package encapsule;
/*
 Date: 20150615
 Author: 아이티뱅크
 Story: main()는 콘솔창에 입력과 출력의 기능을 담당한다. 따라서 Scanner는 main()에 종속되어야 한다
 */
import java.util.Scanner;

public class LeapYearMain {
	// 메소드 구성 형태 : 접근제한자 + 리턴타입 + 메소드이름 + () + {}
	// () 파라미터(매개변수)가 들어오는 위치. 빈공간일 경우도 있음
	// {} 메소드바디라고 부르며 구문(statement)가 위치함
	// 접근제한자는 권한(퍼미션)을 구분하는 역할
	// 리턴타입은 메소드가 반화하는 값이 있을 경우 설정하고 없으면 void
	
	
	public static void main(String[] args) {
		LeapYearVO leapYearMain = new LeapYearVO();
		
		//Scanner scanner = new Scanner(System.in);
		//int year = scanner.nextInt();
		
		// Scanner는 클래스 이름
		// scanner는 인스턴스 변수 이름 ==> 객체명
		// new는 생성자 키워드
		// Scanner() 는 생성자
		// System.in 은 파라미터(매개변수)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scanner.nextInt();
		
		String msg = leapYearMain.getLeapYear(year);
		System.out.println(msg);
		//클래스 이름은 반드시 로직이 담겨있는 클래스 이름과 일치해야 하고
		//객체(인스턴스 변수)는 클래스 이름과 관련이 없어도 된다.
		//다만, 메소드를 호출할 경우 선언된 인스턴스 변수명과는 일치해야한다
	}
}
