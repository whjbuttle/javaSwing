package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 Q. 아래와 같이 출력되는 프로그램 작성
		 === 홍길동의 6월 급여내역 ===
		 본봉 : 300만원
		 세금 : 30만원
		 실급여 : 270만원
		 
		 === 강감찬의 6월 급여내역 ===
		 본봉 : 400만원
		 세금 : 40만원
		 실급여 : 360만원
		 */
		
		PayVO hgd = new PayVO();
		PayVO kgc = new PayVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요. (홍길동)");
		hgd.setName(scanner.next());
		System.out.println("이름을 입력하세요. (강감찬)");
		kgc.setName(scanner.next());
		
		System.out.println("홍길동의 본봉을 입력하세요.");
		hgd.setSalary(scanner.nextInt());
		System.out.println("강감찬의 본봉을 입력하세요.");
		kgc.setSalary(scanner.nextInt());
		
		hgd.setIncome(hgd.getSalary());
		kgc.setIncome(kgc.getSalary());
		
		System.out.println("=== "+ hgd.getName() +" ===");
		System.out.println("본봉: " + hgd.getSalary() + "만원");
		System.out.println("세금: " + hgd.getSalary() * PayVO.TAX + "만원");
		System.out.println("실급여: " + hgd.getIncome() + "만원");
		
		System.out.println("=== "+ kgc.getName() +" ===");
		System.out.println("본봉: " + kgc.getSalary() + "만원");
		System.out.println("세금: " + hgd.getSalary() * PayVO.TAX + "만원");
		System.out.println("실급여: " + kgc.getIncome() + "만원");
	}
}
