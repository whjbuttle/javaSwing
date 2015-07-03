package part1.test;

import java.util.Scanner;

public class Notice {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, sum = 0;	//지역변수는 초기화 필수
		double avg = 0.0d;							//실수는 더블 타입으로 초기화
		String msg = "";							//스트링 타입은 리터럴중에서 null로 초기화
		/* 
		 스캐너로 성적을 입력하면 합계에 따라 합격여부를 통지하는 프로그램
		 조건에 따라 결과값의 통지 내용이 달라짐
		 평균 70 이상이면 합격
		 평균 70 미만이면 불합격
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 성적을 입력하세요.");
		kor = scanner.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		eng = scanner.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3d;
		
		if(avg == 100){
			msg = "보너스 지급";
			//System.out.println("보너스 지급");
		}else if(avg >= 70){
			msg = "합격";
			//System.out.println("합격");
		}else{
			msg = "불합격";
			//System.out.println("불합격");
		}
		System.out.println(msg);
	}
}
