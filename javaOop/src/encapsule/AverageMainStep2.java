package encapsule;

import java.util.Scanner;

public class AverageMainStep2 {
	public static void main(String[] args) {
		AverageVOStep2 hulk = new AverageVOStep2();
		AverageVOStep2 iron = new AverageVOStep2();
		AverageVOStep2 hawk = new AverageVOStep2();
		
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
		
		hulk.tot = AverageVOStep2.calcTot(hulk.kor, hulk.eng);
		hulk.avg = AverageVOStep2.calcAvg(hulk.tot);
		
		iron.tot = AverageVOStep2.calcTot(iron.kor, iron.eng);
		iron.avg = AverageVOStep2.calcAvg(iron.tot);
		
		hawk.tot = AverageVOStep2.calcTot(hawk.kor, hawk.eng);
		hawk.avg = AverageVOStep2.calcAvg(hawk.tot);
		
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
