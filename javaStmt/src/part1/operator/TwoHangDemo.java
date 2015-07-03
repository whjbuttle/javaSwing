package part1.operator;
/*
 Demo : 샘플소스를 뜻하는 접미사
 *Demo.java : 샘플소스를 구현한 클래스
 */
public class TwoHangDemo {
	public static void main(String[] args) {
		int x = 20;
		int y = 7;
		int add, sub, gob, mok, nmg;
		
		/*
		 + : 덧셈기호
		 - : 뺄셈기호
		 * : 곱셈기호
		 / : 나눗셈의 몫을 구하는 기호
		 % : 나눗셈의 나머지를 구하는 기호
		 */
		
		// 곱셈 변수를 gob, 나눗셈의 몫을 구하는 변수를 mok, 나머지 변수는 nmg, 뺄셈을 sub를 출력하시오
		
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		
		System.out.println("x + y = " + add);
		System.out.println("x - y = " + sub);
		System.out.println("x * y = " + gob);
		System.out.println("x / y = " + mok);
		System.out.println("x % y = " + nmg);
	}
}
