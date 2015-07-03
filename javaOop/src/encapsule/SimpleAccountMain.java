package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String inputName = scanner.next();		//문자열을 입력받을 때는 next() 사용함
		System.out.println("입금액을 입력하세요.");
		int money = scanner.nextInt();
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(money);
		
		System.out.println(name + "씨 " + money + "만원 입금되었습니다. 잔고는 " + jango + "만원입니다.");
	}
}
