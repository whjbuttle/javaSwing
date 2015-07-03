package part1.test;

import java.util.Scanner;

/*
 Date: 20150616
 Author: 아이티뱅크
 Story: 입력받는 년도를 보고 윤년인지 아닌지를 판별하는 판독프로그램
 */
public class LeapYear {
	public static void main(String[] args) {
		/*
		 연도를 4로 나눈 값이 0이라면 윤년일 수 있다
		 그러나 해당연수가 100으로 나누어 떨어지면 평년이다
		 평년이라 해도 다시 400으로 나누어 지는 연도는 윤년이다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scanner.nextInt();
		String msg = "";
		if(year%400==0){	//필터링은 결과값을 크게 주는 범위부터 작은 방향으로 진행
			msg = "윤년";
		} else if(year%100==0){
			msg = "평년";
		} else if(year%4==0){
			msg = "윤년";
		} else{
			msg = "평년";
		}
		System.out.println(msg);
	}
}
