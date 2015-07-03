package encapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		KaupVO KaupVO = new KaupVO();
		//클래스명 객체명 = new 생성자명;		객체를 생성하는 패턴
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요.");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요.");
		double weight = scanner.nextDouble();
		
		String msg = KaupVO.getKaup(weight, height);
		//객체명(=인스턴스 참조변수).메소드이름	객체가 메소드를 호출하는 패턴
		System.out.println("카우프지수[키="+height+"cm, 몸무게="+weight+"kg, 카우프지수="+msg+"]");
	}

}
