package inheritance;

public class HyundaiMain {
	public static void main(String[] args) {
		HyundaiCar sonata = new HyundaiCar();
		sonata.setCompanyName("현대");
		sonata.setBrand("소나타");
			System.out.println(
					sonata.getCompanyName() + "\t" +
					sonata.getBrand() + "\t" +
					sonata.CAR
					);
		
		
	}
}
