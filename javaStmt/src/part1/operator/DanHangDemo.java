package part1.operator;

public class DanHangDemo {
	public static void main(String[] args) {
		int i = 5;		//int형 변수 i 선언과 동시에 5값 할당
		i = i + 1;		//i 변수에 다시 i 값을 연산시킨다
		System.out.println("i값을 이항연산자로 계산 했을 경우: " + i);
		i++;			//i + 1 하는 것과 같지만 계산속도가 더 빠르다
		System.out.println("i값을 단항연산자로 계산 했을 경우: " + i);
	}
}
