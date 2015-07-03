package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A의 값을 입력하세요");
		int a = scanner.nextInt();
		System.out.println("B의 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println("C의 값을 입력하세요");
		int c = scanner.nextInt();
		
		if(a > b && a > c){
			System.out.println("가장 큰 수는 A 값인 " + a + " 입니다.");
		}else if(b > a && b > c){
			System.out.println("가장 큰 수는 B 값인 " + b + " 입니다.");
		}else{
			System.out.println("가장 큰 수는 C 값인 " + c + " 입니다.");
		}
	}
}
