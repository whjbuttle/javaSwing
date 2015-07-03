package part1.variable;
/*
 변수의 작성 규칙
 1. 알파벳 대소문자, 숫자, _(언더스코어), $만 사용이 가능
 2. 단, 첫 문자가 숫자이면 안 된다
 3. 키워드(예약어)와 같으면 안 됨
 */
public class Variable2 {
	public static void main(String[] args) {
		// 국어점수 kor, 영어점수 변수명은 eng, 합계는 sum 일 때, 국어 : 85, 영어 : 70 의 합계를 콘솔에 출력하시오
		int kor = 85;
		int eng = 70;
		int sum = kor + eng;
		System.out.println("성적처리\n");
		System.out.println("국어\t영어\t합계");
		System.out.println(kor+"\t"+eng+"\t"+sum);
		//System.out.println("국어 : " + kor + ", 영어 : " + eng + " 의 합계 : " + sum);
		
		//리터럴이란: 알파벳 한 글자만 나타내는 char 형을 사용할 때 작업 효율이 너무 떨어지므로 문자형은 "" 안에 여러 글자를 표기하여 나타낼 수 있게 함
		// \n : 줄바꿈
		// \t : tab 키와 같은 효과. 변수와 함께 쓰면 반드시 리터럴 내부에 사용해야 함
		//위와 같이 특수 기능을 하는 문자열을 escape 문자라고 한다
	}
}
