package abstraction;

import java.util.Scanner;

public class BankBookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNo = (int) ((Math.random()*999999)+11110);
		// 6 자리 정수형 랜덤 숫자 발생
		// valueOf() 는 자바 API 에 있는 java.lang.String 클래스의 메소드로 숫자형을 문자열로 바꿔주는 역할을 한다.
		String strAccountNo = String.valueOf(accountNo);
		System.out.println("예금주 이름 : ");
		String name = scanner.nextLine();
		System.out.println("비밀번호 : ");
		String pass = scanner.nextLine();
		System.out.println("예금액 : ");
		int inputMoney = scanner.nextInt();
		// 객체를 생성할 때 주의해야할 점: 객체를 생성하는 클래스가 인터페이스를 구현한 것이 아니라면 그대로 데이터타입으로 사용해도 되지만
		// 인터페이스를 구현한 클래스라면 인터페이스 타입 + 인스턴스 = new 클래스생성자() 로 객체를 생성한다
		
		Account hong = new BankBook(strAccountNo, name, pass, inputMoney);
		System.out.println(hong.toString());
		
		System.out.println("입금액");
		int depositMoney = scanner.nextInt();
		hong.deposit(depositMoney);
		System.out.println(hong.toString());
		
		System.out.println("출금액");
		int withdrawMoney = scanner.nextInt();
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
	}
}
