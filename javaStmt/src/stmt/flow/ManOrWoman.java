package stmt.flow;

import java.util.Scanner;

public class ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요 (ex. 123456-4123456) : ");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);
		if (ch == '1' || ch == '3'){
			System.out.println("남자");
		} else if (ch == '2' || ch == '4') {
			
		} else if (ch == '5' || ch == '6') {
			
		} else {
			
		}
	}
}
