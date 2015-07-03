package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = scanner.nextInt();
		//int time = 5000;	// 초
		int second = 0, minute = 0, hour = 0;
		
		second = time%60;	// 500초를 60으로 나눈 나머지는 초
		minute = (time/60)%60; 
		hour = (time/60)/60;
		
		System.out.println(hour + " 시간 " + minute + " 분 " + second + "초");
	}
}
