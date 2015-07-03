package stmt.flow;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		//switch문으로 만들기
		System.out.println("3개의 정수를 입력하세요. 입력된 숫자들 중 가장 큰 수를 반환합니다.");
		Scanner scanner = new Scanner(System.in);
		int[] intArr = new int[3];
		int max = 0;
		
		for(int i=0; i < intArr.length; i++){
			intArr[i] = scanner.nextInt();
			if(intArr[i]>max){
				max = intArr[i];
			}
			
		}
		System.out.println("입력된 숫자들 중 가장 큰 수는 " + max + " 입니다.");
	}
}
