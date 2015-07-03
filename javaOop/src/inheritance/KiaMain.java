package inheritance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("기아");
		k5.setCarName("k5");
		System.out.println(
				k5.getCompanyName() + "\t" +
				k5.getCarName() + "\t" +
				Car.CAR
				//좌측 노란색 경고창은 문법적으로 크게 문제는 아니지만 비권장방식으로 코딩했다는 의미
				//위 상황이라면 CAR는 클래스변수이지 인스턴스변수가 아니기 때문에 인스턴스로 호출(k5.CAR)하지말고 클래스로 호출해라(Car.CAR) 라는 뜻이다
				);
		
	}
}
