package encapsule;

public class AverageVOStep2 {
	/*
	 클래스 바로 밑에 (전문용어로 필드) 선언됨
	 변수는 인스턴스변수라 하며 이 인스턴스 변수는 초기화를 해도 되고안 해도 되는데 
	 공용으로 사용하기 때문에 대부분 초기화를 하지 않는다
	 그리고 하지 않아도 문법적 에러가 발생하지 않는다
	 */
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	//합계를 구하는 기능을 main()에서 가져와서 감춘다
	
	public static int calcTot(int kor, int eng){
		//이때 tot은 지역변수이다. 따라서 초기화값을 입력해야함
		//CTRL + SHIFT + /
		/*int tot = 0;
		tot = kor + eng;
		return tot;*/
		return kor + eng;
	}
	
	//평균을 구하는 기능을 main()에서 가져와서 감춘다
	
	public static double calcAvg(int tot){
		/*double avg = tot / 2;
		return avg;*/
		return tot/2;
	}
}
