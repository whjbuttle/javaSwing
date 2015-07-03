package part1.variable;
/*
 변수(variable)
 - 데이터 타입에 명시된 형태의 데이터를 담을 수 있는 메모리이다
 - 변수는 데이터 타입을 통해서 존재할 수 있다
 - 변수를 만드는 이유는 데이터를 보관하기 위해서이다
 - 변수의 이름은 해당 메모리를 핸들할 수 있는 유일한 수단이다
 - 변수에는 데이터 타입에 맞는 형의 데이터를 넣어야 한다
 
 ※ 주의사항
 데이터 타입이 선언된 변수는 값은 이름의 변수를 또 다시 선언할 수 없다
 단, 데이터 타입과 같이 쓰이지 않는 변수는 재활용이 가능하다
 
 할당(Assignment)
 - 할당이란 변수에 값을 집어넣는 행위
 */
public class Variable {
	public static void main(String[] args) {
		int num = 200;
		System.out.println("num 출력한 값: " +num);
		//run as 실행 단축키: CTRL + F11
		
		// Q. 변수 abc 에 숫자값 2000 출력
		int abc = 2000;
		System.out.println("abc를 출력한 값: " + abc);
	
		// 2200을 출력하시오.
		int a = 2200;
		System.out.println("a를 출력한 값: " + a);
		
		//자바에서 변수를 선언해서 사용하는 이유는 재활용을 위함이다
		int result;
		//result = num + abc;
		//System.out.println("num 과 abc의 합: " + result);
		// 가독성 : 뜻이 불분명해지는 것을 막고 분명한 결과값을 출력하기 위한 코딩
		
		System.out.print("num 과 abc의 합: ");
		System.out.println(num + abc);
		
		abc = 40000;	//overwrite
		System.out.println("abc을 출력한 값: " + abc);
	}
}
