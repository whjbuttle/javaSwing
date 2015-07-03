package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 스캐너 클래스의 객체인 scanner를 생성하였다.
		 */
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//System.out.println("숫자를 입력해 주세요");
		//int a = scanner.nextInt();
		//System.out.println(a);
		
		// for문으로 입력된 값만큼의 합을 구하는 연산식을 구현하세요
		System.out.println("숫자를 입력해 주세요");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++)
		{
			sum += i;
		}
		System.out.println("1 부터 " + num + " 까지의 합은 = " + sum);
		//출력값은 for문이 다 돈 다음에 나와야하므로 바깥쪽
	}
}