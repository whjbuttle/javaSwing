package encapsule;

import java.util.Scanner;

/*
 Date: 20150616
 Author: 아이티뱅크
 Story: 메인메소드에서  
 */
public class LeapYearVO {
	public String getLeapYear(int year){
		/*
		 연도를 4로 나눈 값이 0이라면 윤년일 수 있다
		 그러나 해당연수가 100으로 나누어 떨어지면 평년이다
		 평년이라 해도 다시 400으로 나누어 지는 연도는 윤년이다.
		 */
		
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
		//System.out.println(msg);
		return msg;
	}
	//출력값을 독립시키기 위해서는 메소드에 리턴타입을 void가 아닌 리턴값에 따른 데이터타입을 주면 된다
}
