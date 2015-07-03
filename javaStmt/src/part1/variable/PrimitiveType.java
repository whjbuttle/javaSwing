package part1.variable;
/*
 기본형 타입 8가지
 1. 논리형 (1 바이트)
 	boolean - 1 byte
 2. 바이트 (1 바이트)
 	byte - 1 byte	//개념적으로 만듦, 거의 안 쓴다
 3. 문자 (2 바이트)		
 	char - 2 byte	//알파벳
 4. 정수 (2, 4, 8 바이트)
 	short - 2 byte	//거의 안 쓴다
 	int - 4 byte
 	long - 8 byte
 5. 실수 (4, 8 바이트)
 	float - 4 byte
 	double - 8 byte 	
 */
public class PrimitiveType {
	public static void main(String[] args) {
		//논리형 1 바이트, 초기값: false;
		boolean result = true;
		//문자형 2 바이트(char), 초기값: = \u0000
		char c = 'C';				//알파벳 한 글자를 나타내며 대소문자를 구분한다 ※ 주의: 싱글쿼터 사용
		//정수형
		byte varByte = 100;
		short varShort = 10000;
		int varInt = 10000000;
		long varLong = 100L;		//숫자값 뒤에다 알파벳 l 또는 L를 표기. 가독성을 위해 대문자표기를 추천
		//실수형
		float varFloat = 100.00f;	//숫자값 뒤에 F 또는 f 를 표기함
		double varDouble = 100.00d;	//숫자값 뒤에 D 또는 d 를 표기함
		
		// 1바이트 = 8 비트
		// 1비트 : 숫자 0과 1로 이루어짐

		// 요즘은 메모리 용량에 제한이 거의 없기 때문에 boolean, int, double 을 주로 쓴다
		
		// Q. 3.14를 콘솔에 출력하시오
		
		double d = 3.14d;
		System.out.println("3.14를 출력한 값: " + d);
	}
}
