package encapsule;

import java.util.Scanner;

public class AverageMainStep1 {
	public static void main(String[] args) {
		//학생 객체생성 및 메모리 할당
		
		AverageVOStep1 hulk = new AverageVOStep1();
		AverageVOStep1 iron = new AverageVOStep1();
		AverageVOStep1 hawk = new AverageVOStep1();
		
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크";
		
		Scanner scanner = new Scanner(System.in);
		
		//점수저장
		System.out.println("헐크의 국어점수 : ");
		hulk.kor = scanner.nextInt();
		System.out.println("헐크의 영어점수 : ");
		hulk.eng = scanner.nextInt();
		
		System.out.println("아이언의 국어점수 : ");
		iron.kor = scanner.nextInt();
		System.out.println("아이언의 영어점수 : ");
		iron.eng = scanner.nextInt();
		
		System.out.println("호크의 국어점수 : ");
		hawk.kor = scanner.nextInt();
		System.out.println("호크의 영어점수 : ");
		hawk.eng = scanner.nextInt();
		
		//총점과 평균 계산
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		//출력
		System.out.println("==="+hulk.name+" 의 성적표===");
		System.out.println("국어 : " + hulk.kor);
		System.out.println("영어 : " + hulk.eng);
		System.out.println("합계 : " + hulk.tot);
		System.out.println("평균 : " + hulk.avg);
		System.out.println();
		
		System.out.println("==="+iron.name+" 의 성적표===");
		System.out.println("국어 : " + iron.kor);
		System.out.println("영어 : " + iron.eng);
		System.out.println("합계 : " + iron.tot);
		System.out.println("평균 : " + iron.avg);
		System.out.println();
		
		System.out.println("==="+hawk.name+" 의 성적표===");
		System.out.println("국어 : " + hawk.kor);
		System.out.println("영어 : " + hawk.eng);
		System.out.println("합계 : " + hawk.tot);
		System.out.println("평균 : " + hawk.avg);
		System.out.println();
	}
}
