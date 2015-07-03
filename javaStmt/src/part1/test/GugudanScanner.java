package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		//스캐너 호출
		System.out.println("출력할 단을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		if(dan>1){
			for (int i = 1; i < 10; i++){
				System.out.println( dan + " * " + i + " = " + dan * i);
			}
			
		}else{
			System.out.println("1 이상의 정수값만 입력하세요");
		}
	}
}
